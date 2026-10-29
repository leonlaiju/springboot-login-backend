package com.example.recipefinder.controller; 
import com.example.recipefinder.model.User; 
import com.example.recipefinder.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*; 
@RestController 
@RequestMapping("/auth") 
public class AuthController { 
	@Autowired 
	private UserService userService; 
	@PostMapping("/register") 
	public User registerUser(@RequestBody User user) { 
		return userService.registerUser(user); 
		} 
	@PostMapping("/login")
	public User loginUser( 
			@RequestParam String email, 
	        @RequestParam String password) { 
		return userService.loginUser(email, password); 
	    }
	@GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}
	}