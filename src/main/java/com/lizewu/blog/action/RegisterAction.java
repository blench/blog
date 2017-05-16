package com.lizewu.blog.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

import org.apache.struts2.ServletActionContext;

import com.lizewu.blog.po.User;
import com.lizewu.blog.service.UserService;
import com.lizewu.blog.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private User user; 
	private UserService userService;
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		 HttpServletRequest request = ServletActionContext.getRequest();
		if(userService.registerUser(user))
		{
			request.setAttribute("info","×¢²á³É¹¦");
			request.setAttribute("url", "login.jsp");
			return this.SUCCESS;
		}
			
		else
		{
			request.setAttribute("info", "×¢²áÊ§°Ü");
			request.setAttribute("url", "register.jsp");
			return this.ERROR;
		}
		
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
