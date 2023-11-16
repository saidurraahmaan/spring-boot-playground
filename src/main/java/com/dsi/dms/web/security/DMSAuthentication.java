package com.dsi.dms.web.security;

import com.dsi.dms.domain.dto.DMSUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class DMSAuthentication implements Authentication
{
    private DMSUser userDetails;

    private boolean isAuthenticated;
    private Collection<? extends GrantedAuthority> groups;

    public DMSAuthentication(DMSUser userDetails, boolean isAuthenticated)
    {
        this.userDetails = userDetails;
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return groups;
    }

    @Override
    public Object getCredentials()
    {
        return null;
    }

    @Override
    public Object getDetails()
    {
        return null;
    }

    @Override
    public Object getPrincipal()
    {
        return null;
    }

    @Override
    public boolean isAuthenticated()
    {
        return false;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException
    {

    }

    @Override
    public String getName()
    {
        return null;
    }
}
