package com.rocket.agr.service;

import javax.inject.Named;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.rocket.agr.model.RocketUserDetail;

@Named("rocketUserDetailService")
public class RocketUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		//TODO implement this later
		return new RocketUserDetail("marcel", "toto");
	}

}
