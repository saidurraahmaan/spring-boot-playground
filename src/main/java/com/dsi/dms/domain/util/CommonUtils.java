package com.dsi.dms.domain.util;


import com.dsi.dms.domain.dto.DMSUser;
import com.dsi.dms.domain.dto.DomainEnum;
import com.dsi.dms.web.config.AppSettings;
import com.dsi.dms.domain.exception.ServiceExceptionBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Objects;

@Component
public class CommonUtils
{
    private final MessageSource messageSource;
    private final AppSettings appSettings;

    @Autowired
    public CommonUtils(MessageSource messageSource, AppSettings settings)
    {
        this.messageSource = messageSource;
        this.appSettings = settings;
    }

    public String getLocalizedMessage(Locale locale, String key, Object... parameters)
    {

        if (Objects.isNull(locale))
        {
            return messageSource.getMessage(key, parameters, appSettings.getDefaultLocale());
        }

        return messageSource.getMessage(key, parameters, locale);
    }

    public String getLocalizedMessage(String key, Object... parameters)
    {
        return getLocalizedMessage(LocaleContextHolder.getLocale(), key, parameters);
    }

    public String getLocalizedMessage(ServiceExceptionBase exception)
    {
        return getLocalizedMessage(exception.getMessageResourceKey());
    }

    public DMSUser getCurrentUser()
    {
        var auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth != null && auth.isAuthenticated())
        {
            return (DMSUser) auth.getPrincipal();
        }
        return null;
    }
}
