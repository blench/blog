package com.lizewu.blog.dao;

import com.lizewu.blog.po.BlogInfo;

public interface BlogInfoDao {
	
	//������Ի�����
	public void save(BlogInfo blogInfo);
	
	//���
	public BlogInfo get(String username);
}
