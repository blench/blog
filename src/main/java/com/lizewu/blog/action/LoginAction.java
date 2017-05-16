package com.lizewu.blog.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.lizewu.blog.po.User;
import com.lizewu.blog.service.UserService;
import com.lizewu.blog.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private User user;
	private UserService userService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, Object> session = ActionContext.getContext().getSession();
		if(userService.loginUser(user))
		{
			session.put("username", user.getUsername());
			request.setAttribute("url","user/editbloginfo.jsp");
			request.setAttribute("info", "µÇÂ¼³É¹¦");
			return SUCCESS;
		}else
		{
			request.setAttribute("url","login.jsp");
			request.setAttribute("info", "µÇÂ¼Ê§°Ü");
			return ERROR;
		}
		
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
