package com.rocket.agr.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

@Named("rocketAuthenticationProvider")
public class RocketAuthenticationProvider implements AuthenticationProvider{

	@Inject
	private  RocketUserDetailService rocketUserDetailService;
	
	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		String username= auth.getName();
		String password = (String) auth.getCredentials();
		UserDetails user = rocketUserDetailService.loadUserByUsername(username);
		if(user == null || !password.equals(user.getPassword())){
			throw new BadCredentialsException("Utilisateur ou mot de passe incorrecte");
		}
		return new UsernamePasswordAuthenticationToken(username, password);
	}

	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

}
