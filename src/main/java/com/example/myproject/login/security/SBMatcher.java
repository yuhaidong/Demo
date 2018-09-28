package com.example.myproject.login.security;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.springframework.stereotype.Component;

import com.example.myproject.login.entity.impl.UserImpl;

@Component
public class SBMatcher extends SimpleCredentialsMatcher {

//	@Override
//    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
//        UsernamePasswordToken utoken = (UsernamePasswordToken) token;
//        //获得用户输入的密码:(可以采用加盐(salt)的方式去检验)
//        String inPassword = new String(utoken.getPassword());
//        //获得数据库中的用户
//        SBUser sbUser = (SBUser) info.getCredentials();
//        if (sbUser == null) {
//            return false;
//        }
//        //进行密码的比对
//        return sbUser.checkSha512Passwd(inPassword);
//	}
}
