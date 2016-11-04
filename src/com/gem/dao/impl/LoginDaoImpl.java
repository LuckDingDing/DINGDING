package com.gem.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gem.dao.BaseDao;
import com.gem.dao.LoginDao;
import com.gem.entity.Login;

@Repository("logindao")
public class LoginDaoImpl extends BaseDao implements LoginDao {

	
	//µÇÂ¼
	@Override
	public List<Login> queryLogin(String name) {
		return getSession().createQuery("from Login u where u.loginName='"+name+"'").list();
	}

	
	
	
	//×¢²áÓÃ»§
	@Override
	public boolean addLogin(Login log) {	
		getSession().save(log);
		return true;
	}

}
