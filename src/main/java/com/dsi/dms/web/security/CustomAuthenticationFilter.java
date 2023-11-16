package com.dsi.dms.web.security;

import com.dsi.dms.domain.dto.DMSUser;
import com.dsi.dms.domain.dto.RolewiseJurisdiction;
import com.dsi.dms.domain.enums.UserType;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import java.io.IOException;
import java.util.ArrayList;

public class CustomAuthenticationFilter extends AbstractAuthenticationProcessingFilter
{
    protected CustomAuthenticationFilter(String defaultFilterProcessesUrl)
    {
        super(defaultFilterProcessesUrl);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException
    {
        // getAuthenticationManager().authenticate()
        var testUser = new DMSUser();
        testUser.setUserName("10325699");
        testUser.setUserId(12);
        testUser.setType(UserType.OFFICER);
        testUser.setEmail("testuser@voss.com");
        testUser.setPhone("01800000000");
        var activeJurisdiction = new RolewiseJurisdiction();
        activeJurisdiction.setPath("/2/3/4");
        testUser.setActiveJurisdiction(activeJurisdiction);
        var allJurisdictions = new ArrayList<RolewiseJurisdiction>();
        allJurisdictions.add(activeJurisdiction);
        testUser.setJurisdictions(allJurisdictions);
        return new DMSAuthentication(testUser, true);
    }
}
