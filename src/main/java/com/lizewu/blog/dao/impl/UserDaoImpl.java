package com.lizewu.blog.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lizewu.blog.dao.UserDao;
import com.lizewu.blog.po.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().flush();
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryById(String username) {
		// TODO Auto-generated method stub
		List<User> list = (List<User>) this.getHibernateTemplate().find("select user from User user where user.username = '"+username+"'");
		return list.size()==0?null:list.get(0);
	}

}
