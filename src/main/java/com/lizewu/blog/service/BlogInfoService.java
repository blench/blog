package com.lizewu.blog.service;

import com.lizewu.blog.po.BlogInfo;

public interface BlogInfoService {
	
	//设置个性化内容
	public void setBlogInfo(BlogInfo blogInfo);
	
	//获得个性化内容
	
	public BlogInfo getBlogInfo(String username);
}
