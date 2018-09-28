package com.example.myproject.login.service;

import com.example.myproject.login.entity.User;

public interface UserService {

	public User findByUserName(String username);
	
//	public User updateUser(User user);
}
