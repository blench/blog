package com.lizewu.blog.dao.impl;

import java.util.List;
/**
 * 记住这里使用的是Hibernate5
 */
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lizewu.blog.dao.BlogInfoDao;
import com.lizewu.blog.po.BlogInfo;
import com.lizewu.blog.po.User;

public class BlogInfoDaoImpl extends HibernateDaoSupport implements BlogInfoDao {

	@Override
	public void save(BlogInfo blogInfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(blogInfo);
	}

	@Override
	public BlogInfo get(String username) {
		// TODO Auto-generated method stub
		List<BlogInfo> list = (List<BlogInfo>) this.getHibernateTemplate().find("select blogInfo from BlogInfo blogInfo where blogInfo.username = '"+username+"'");
//		return list.size()==0?null:list.get(0);
		return list.size()==0?null:list.get(0);
	}

}
