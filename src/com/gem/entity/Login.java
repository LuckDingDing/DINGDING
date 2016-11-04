package com.gem.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gem_login")
public class Login implements Serializable {
	
	
	private int  logno;
	private String loginName;
	private String loginPas;
	
	public Login() {
	}
	public Login(int logno, String loginName, String loginPas) {
		this.logno = logno;
		this.loginName = loginName;
		this.loginPas = loginPas;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getLogno() {
		return logno;
	}
	public void setLogno(int logno) {
		this.logno = logno;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPas() {
		return loginPas;
	}
	public void setLoginPas(String loginPas) {
		this.loginPas = loginPas;
	}
}
