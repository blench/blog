package com.lizewu.blog.dao;

import java.util.List;

import com.lizewu.blog.po.User;

public interface UserDao {
	
	//����û�
	public void add(User user);
	
	//ɾ���û�
	public void delete(User user);
	
	//�����û�
	public void update(User user);
	
	//��������
	public List<User> queryAll();
	
	//ͨ���˺Ų����û�
	public User queryById(String username);
}
