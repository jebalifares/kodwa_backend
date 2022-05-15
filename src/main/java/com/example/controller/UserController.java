package com.example.controller;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Role;
import com.example.model.User;
import com.example.model.UserRole;
import com.example.service.UserService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/api")
public class UserController {
	@Autowired 
	private UserService userService;
	//creation user 
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		
		Role role=new Role();
		role.setRoleId(45L);
		role.setRoleName("NORMAL");
		UserRole userRole=new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		
		Set<UserRole> roles=new HashSet<>();
		roles.add(userRole);
		return this.userService.createUser(user, roles);
		
		
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		
		return this.userService.getUser(username);
		
	}

	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		this.userService.deleteUserById(id);
		
	}


}
