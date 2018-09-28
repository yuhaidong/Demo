package com.example.myproject.login.entity.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.myproject.common.Encrypt;
import com.example.myproject.login.entity.User;

import lombok.Data;

@Data
public class UserImpl extends User {

//	@Autowired
//    private Encrypt encrypt;
//	
//	public boolean checkSha512Passwd(String SHA512) {
//        if(encrypt==null){
//            encrypt=new Encrypt();
//        }
//        String result = "";
//        result = encrypt.SHA512Salt(SHA512, this.getSalt());
//        return result.equals(this.getPassword());
//    }
}
