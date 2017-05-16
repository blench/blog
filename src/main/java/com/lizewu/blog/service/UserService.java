package com.lizewu.blog.service;

import com.lizewu.blog.po.User;

/**
 * 用户接口操作类
 * @author Administrator
 *
 */
public interface UserService {
	
	public boolean registerUser(User user);
	
	public boolean loginUser(User user);
	
	
}
