package com.example.myproject.login.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.myproject.login.entity.User;
import com.example.myproject.login.service.UserService;

public class SBAuthorizingRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authToken) throws AuthenticationException {
		
		UsernamePasswordToken token = (UsernamePasswordToken) authToken;
//		FlxoaUser flxoaUser = flxoaUserMng.findByUserName(token.getUsername());
		User user = userService.findByUserName(token.getUsername());

		if (user != null) {
			return new SimpleAuthenticationInfo(user,
					user, getName());
		}

		return null;
	}
	
	protected UserService userService;

//	@Autowired
//	public void setFlxoaUserMng(YhdmvcUserManager yhdmvcUserManager) {
//		this.yhdmvcUserManager = yhdmvcUserManager;
//	}
	
	@Autowired
	public void setProjectmvcUserManager(UserService userService) {
		this.userService = userService;
	}

}
