package com.example.myproject.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.myproject.login.dao.UserMapper;
import com.example.myproject.login.entity.User;
import com.example.myproject.login.service.UserService;

@Service
@Lazy
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findByUserName(String username) {
		
		User user = userMapper.findByUserName(username);
		
		return user;
	}

	@Override
	public User updateUser(User user) {
		
		User currentUser = userMapper.updateUser(user);
		
		return currentUser;
	}

}
