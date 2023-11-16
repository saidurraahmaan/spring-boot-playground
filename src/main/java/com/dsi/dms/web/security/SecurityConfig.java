package com.dsi.dms.web.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;
import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
class SecurityConfig
{
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer()
    {
        // Allowing access to h2-console
        return web -> web.ignoring().requestMatchers(new AntPathRequestMatcher("/h2-console/**"));
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        return http.csrf(c->c.disable())
                   .cors(withDefaults())
                   .exceptionHandling(withDefaults())
//                   .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                   //.passwordManagement(mgmt->mgmt.changePasswordPage("/path/to/change-password/endpoint"))
                   .sessionManagement(mgmt->mgmt.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                   //.formLogin(withDefaults())
                   .addFilterBefore(new CustomAuthenticationFilter("http://103.69.149.41/SSO/Account/"), LogoutFilter.class)
                   .build();
    }

    // For custom auth filter, can extend AbstractAuthenticationProcessingFilter and register with addFilter
    // This filter should just collect auth input (i.e. username/password etc) and use authenticationManager to
    // authenticate. Or can set SecurityContext with some Authentication.
    // If username/password are the inputs, then no need to create customFilter, this is already captured by
    // UsernamePasswordAuthenticationFilter via formLogin()

}
