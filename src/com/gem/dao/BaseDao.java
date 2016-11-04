package com.gem.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository
public class BaseDao {
	@Resource
	private SessionFactory sessionFactory ;

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public static void main(String[] args) {
		BaseDao b = new BaseDao();
		System.out.println(b.getSession());
	}
	
}
