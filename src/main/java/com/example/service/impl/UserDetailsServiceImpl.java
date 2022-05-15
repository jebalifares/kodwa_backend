package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repo.UserRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	
	@Autowired
	private UserRepository Userrepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=this.Userrepository.findByUsername(username);
		
		if(user==null) {
			System.out.println("User Not found");
			throw new UsernameNotFoundException("No user found");
		}
		return user;
	}

}
