package com.lizewu.blog.service;

import com.lizewu.blog.po.BlogInfo;

public interface BlogInfoService {
	
	//���ø��Ի�����
	public void setBlogInfo(BlogInfo blogInfo);
	
	//��ø��Ի�����
	
	public BlogInfo getBlogInfo(String username);
}
