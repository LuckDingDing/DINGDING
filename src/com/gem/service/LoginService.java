package com.gem.service;

import java.util.List;

import com.gem.entity.Login;

public interface LoginService {
	
	//��¼     �����û�����ѯ���з��ϵ��û�
	public Login queryLogin(Login log);
	
	//ע�� 
	public boolean addLogin(Login log);
	
	

}
