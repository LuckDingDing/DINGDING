package com.gem.dao;

import java.util.List;

import com.gem.entity.Login;

public interface LoginDao {
	
	//��¼     �����û�����ѯ���з��ϵ��û�
	public List<Login> queryLogin(String name);
	
	//ע�� 
	public boolean addLogin(Login log);

}
