package com.example.myproject.login.entity;

import lombok.Data;

@Data
public class User implements java.io.Serializable {

	private String id;
	private String loginName;
	private String password;

}
