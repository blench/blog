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
		//�ж��û��Ƿ����
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
		//�ж��û��Ƿ����
		User queryUser = userDao.queryById(user.getUsername());
		if(queryUser==null)
			return false;
		else
		{
			//ȡ���û������ж������Ƿ�һ��
			if(queryUser.getPassword().equals(user.getPassword()))
				return true;
		}
		return false;
	}

}
