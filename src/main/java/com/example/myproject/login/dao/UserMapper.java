package com.example.myproject.login.dao;

import com.example.myproject.login.entity.User;

public interface UserMapper {

	public User findByUserName(String username);

	public User updateUser(User user);
}
