package com.gem.dao;

import java.util.List;

import com.gem.entity.Login;

public interface LoginDao {
	
	//登录     根据用户名查询所有符合的用户
	public List<Login> queryLogin(String name);
	
	//注册 
	public boolean addLogin(Login log);

}
