package com.restaurent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restaurent.model.User;
import com.restaurent.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginServiceImpl;
	
	@GetMapping("/login/{userId}/{password}")
	private void validateUser(@PathVariable String userId,@PathVariable String password) {
		User user  = new User();
		user.setUserId(userId);
		user.setPassword(password);
		System.out.println(user.toString());
		
		this.loginServiceImpl.validateUser(user);
		
	}
}
