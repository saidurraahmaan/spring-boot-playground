package com.dsi.dms.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppSettings
{

    private final Locale defaultLocale;

    @Autowired
    public AppSettings(@Value("${app.defaultLanguage:english}") String defaultLanguage)
    {
        defaultLocale = defaultLanguage.equalsIgnoreCase("english") ? AppConstants.ENGLISH_LOCALE : AppConstants.BANGLA_LOCALE;
    }

    public Locale getDefaultLocale()
    {
        return defaultLocale;
    }
}
