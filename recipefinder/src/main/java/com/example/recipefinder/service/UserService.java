package com.example.recipefinder.service; 
import java.util.List;
import com.example.recipefinder.model.User; 
public interface UserService { 
	User registerUser(User user); 
	User loginUser(String email, String password);
	List<User> getUsers();
	}