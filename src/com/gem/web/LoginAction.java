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
	
	
	//�û�ע��
	public String addLogin() throws Exception{
		
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		if(loginService.addLogin(log)){
			out.println("<script>alert('��ӳɹ�');location.href='index.jsp'</script>");
		}else{
			out.println("<script>alert('���ʧ��');location.href='index.jsp'</script>");
		}
		return "login";
	}
	
	
	//�û���¼
	public  String querylogin() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =  response.getWriter();
		Login lo = loginService.queryLogin(log);
		if(lo!=null){
			//������뱣����������
			lo.setLoginPas(null);
			ActionContext.getContext().getSession().put("LogUser", lo);
			return "main";
		}else{	
			out.println("<script>alert('��¼ʧ��');location.href='index.jsp'</script>");
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
