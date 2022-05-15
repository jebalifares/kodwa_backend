package com.example.service;

import java.util.Set;

import com.example.model.User;
import com.example.model.UserRole;

public interface UserService {
	//creation user
	public User createUser(User user,Set<UserRole> userRoles);
	//get user
	public User getUser(String username);
	//delete user by id
	public void deleteUserById(Long id);

}
