package com.lizewu.blog.dao;

import java.util.List;

import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.po.Article;

public interface ArticleDao {
	
	//保存文章
	public void add(Article artical);
	
	
	//展示所有的文章
	public List<Article> showUserAllArticle(String username);
	
	//获取总文章数
	public int queryUserAllCount(String username);
	
	//根据页面设置来查询文章数
	public List<Article> queryUserArticleByPage(String username,Page page);
	
	public Article showArticle(int id);
}
