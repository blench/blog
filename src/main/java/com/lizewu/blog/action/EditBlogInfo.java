package com.lizewu.blog.action;

import java.util.Map;

import com.lizewu.blog.po.BlogInfo;
import com.lizewu.blog.service.BlogInfoService;
import com.lizewu.blog.service.impl.BlogInfoServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EditBlogInfo extends ActionSupport {
	
	private BlogInfo blogInfo;
	private BlogInfoService blogInfoService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		blogInfo.setUsername(username);
		blogInfoService.setBlogInfo(blogInfo);
		return SUCCESS;
	}
	public BlogInfo getBlogInfo() {
		return blogInfo;
	}
	public void setBlogInfo(BlogInfo blogInfo) {
		this.blogInfo = blogInfo;
	}
	public BlogInfoService getBlogInfoService() {
		return blogInfoService;
	}
	public void setBlogInfoService(BlogInfoService blogInfoService) {
		this.blogInfoService = blogInfoService;
	}
}
