package com.lizewu.blog.service.impl;

import com.lizewu.blog.dao.UserDao;
import com.lizewu.blog.dao.impl.UserDaoImpl;
import com.lizewu.blog.po.User;
import com.lizewu.blog.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		//判断用户是否存在
		if(userDao.queryById(user.getUsername())!=null)
			return false;
		else
		{
			userDao.add(user);
			return true;
		}
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public boolean loginUser(User user) {
		// TODO Auto-generated method stub
		//判断用户是否存在
		User queryUser = userDao.queryById(user.getUsername());
		if(queryUser==null)
			return false;
		else
		{
			//取出用户，并判断密码是否一致
			if(queryUser.getPassword().equals(user.getPassword()))
				return true;
		}
		return false;
	}

}
