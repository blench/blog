package com.lizewu.blog.service;

import com.lizewu.blog.po.User;

/**
 * �û��ӿڲ�����
 * @author Administrator
 *
 */
public interface UserService {
	
	public boolean registerUser(User user);
	
	public boolean loginUser(User user);
	
	
}
