package com.lizewu.blog.dao;

import com.lizewu.blog.po.BlogInfo;

public interface BlogInfoDao {
	
	//保存个性化设置
	public void save(BlogInfo blogInfo);
	
	//获得
	public BlogInfo get(String username);
}
