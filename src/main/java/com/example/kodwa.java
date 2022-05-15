package com.example;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Role;
import com.example.model.User;
import com.example.model.UserRole;
import com.example.service.UserService;

@SpringBootApplication
public class kodwa implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(kodwa.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("starting coding");
		/*
		User user=new User();
		user.setFirstName("feres");
		user.setLastName("jbeli");
		
		user.setUsername("zayn");
		user.setPassword("azerty");
		user.setEmail("faresjebali2015@gmail.com");
		user.setProfile("default.png");
		
		Role role1=new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");
		Set<UserRole> userRoleSet=new HashSet<>();
		UserRole userRole=new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		
		userRoleSet.add(userRole);
		User user1=this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());*/
	}

}
