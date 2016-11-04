package com.gem.service;

import java.util.List;

import com.gem.entity.Login;

public interface LoginService {
	
	//登录     根据用户名查询所有符合的用户
	public Login queryLogin(Login log);
	
	//注册 
	public boolean addLogin(Login log);
	
	

}
