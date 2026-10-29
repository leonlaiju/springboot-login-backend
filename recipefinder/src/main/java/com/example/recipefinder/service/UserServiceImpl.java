package com.example.recipefinder.service; 

import com.example.recipefinder.model.User; 
import com.example.recipefinder.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
@Service 
public class UserServiceImpl implements UserService { 
	@Autowired 
	private UserRepository userRepository; 
	@Override 
	public User registerUser(User user) { 
		return userRepository.save(user); 
		} 
	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	@Override 
	public User loginUser(String email, String password) { 
	 
	    User user = userRepository 
	            .findByEmail(email) 
	            .orElse(null); 
	 
	    if (user != null && 
	            user.getPassword().equals(password)) { 
	 
	        return user; 
	    } 
	 
	    return null; 
	} 
	}