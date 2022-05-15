package com.example.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.model.UserRole;
import com.example.repo.UserRepository;
import com.example.repo.RoleRepository;
import com.example.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository ;
	@Autowired
	private RoleRepository roleRepository ;

	@Override
	public User createUser(User user, Set<UserRole> userRoles)   {
		// TODO Auto-generated method stub
		
		User local=this.userRepository.findByUsername(user.getUsername());
		if(local!=null) {
			System.out.println("User deja existé");
			
			
		}else {
			//create user 
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local=this.userRepository.save(user);
			
		}
		return local;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
		
	}

}
