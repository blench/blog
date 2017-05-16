package com.lizewu.blog.dao;

import java.util.List;

import com.lizewu.blog.po.User;

public interface UserDao {
	
	//添加用户
	public void add(User user);
	
	//删除用户
	public void delete(User user);
	
	//更新用户
	public void update(User user);
	
	//查找所有
	public List<User> queryAll();
	
	//通过账号查找用户
	public User queryById(String username);
}
