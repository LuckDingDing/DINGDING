package com.gem.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.gem.entity.Login;
import com.gem.service.LoginService;
import com.opensymphony.xwork2.ActionContext;

@Controller("logAction")
public class LoginAction {

	
	@Resource
	private LoginService loginService;
	
	private Login log;
	
	
	//用户注册
	public String addLogin() throws Exception{
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		if(loginService.addLogin(log)){
			out.println("<script>alert('添加成功');location.href='index.jsp'</script>");
		}else{
			out.println("<script>alert('添加失败');location.href='index.jsp'</script>");
		}
		return "login";
	}
	
	
	//用户登录
	public  String querylogin() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =  response.getWriter();
		Login lo = loginService.queryLogin(log);
		if(lo!=null){
			//清空密码保存在作用域
			lo.setLoginPas(null);
			ActionContext.getContext().getSession().put("LogUser", lo);
			return "main";
		}else{	
			out.println("<script>alert('登录失败');location.href='index.jsp'</script>");
		}
		out.close();
		return null;
	}
	
	
	
	
	
	
	


	public Login getLog() {
		return log;
	}

	public void setLog(Login log) {
		this.log = log;
	}
}
