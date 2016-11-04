package com.gem.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gem.dao.LoginDao;
import com.gem.entity.Login;
import com.gem.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	//ÉùÃ÷dao
	@Resource(name="logindao")
	private LoginDao logdao;
	
	
	
	//µÇÂ¼
	@Override
	public Login queryLogin(Login log) {
		
		if(log!=null){
			List<Login> logins= logdao.queryLogin(log.getLoginName());
			for (Login los : logins) {
				if(los.getLoginPas().equals(log.getLoginPas()));
				return los;
			}
		}
		return null;
	}

	
	
	
	//×¢²á
	@Override
	public boolean addLogin(Login log) {
		
		if(log!=null){
			if(log.getLoginName()!=null&&log.getLoginPas()!=null&&log.getLoginName().length()>0){
				logdao.addLogin(log);
			}
			return true;
		}
		return false;
	}
	
	
	
	
	
	

	public void setLogdao(LoginDao logdao) {
		this.logdao = logdao;
	}







}
