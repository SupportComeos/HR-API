package com.hikaad.security;

import com.hikaad.global.service.UsersService;
import com.hikaad.utils.HikaadLogger;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

public class AppAuthProvider extends DaoAuthenticationProvider {

    private static final    String          MODULE          = "{AppAuthProvider} - ";
    private                 UsersService    usersService;

    AppAuthProvider(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) {
        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
        UserDetails user = usersService.loadUser(auth.getName(), auth.getCredentials().toString());
        if (null == user) {
            HikaadLogger.error(MODULE + "Username/Password does not match for " + auth.getPrincipal());
            throw new BadCredentialsException("Username/Password does not match for " + auth.getPrincipal());
        }
        return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}