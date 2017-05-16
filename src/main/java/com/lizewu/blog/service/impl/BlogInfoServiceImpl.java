package com.lizewu.blog.service.impl;


import com.lizewu.blog.dao.BlogInfoDao;
import com.lizewu.blog.dao.impl.BlogInfoDaoImpl;
import com.lizewu.blog.po.BlogInfo;
import com.lizewu.blog.service.BlogInfoService;

public class BlogInfoServiceImpl implements BlogInfoService{
	
	private BlogInfoDao blogInfoDao;
	

	public BlogInfoDao getBlogInfoDao() {
		return blogInfoDao;
	}

	public void setBlogInfoDao(BlogInfoDao blogInfoDao) {
		this.blogInfoDao = blogInfoDao;
	}

	@Override
	public void setBlogInfo(BlogInfo blogInfo) {
		// TODO Auto-generated method stub
		blogInfoDao.save(blogInfo);
	}

	@Override
	public BlogInfo getBlogInfo(String username) {
		// TODO Auto-generated method stub
		return blogInfoDao.get(username);
	}

}
