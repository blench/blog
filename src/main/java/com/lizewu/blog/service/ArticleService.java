package com.lizewu.blog.service;

import java.util.List;

import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.fenye.Result;
import com.lizewu.blog.po.Article;

public interface ArticleService {
	
	//添加文章
	public void addArticle(Article article);
	

	//展示所有的文章
	public List<Article> showUserAllArticle(String username);
	
	
	//分页显示用户文章
	public Result showUserArticleByPage(String username,Page page);
	
	//展示用户的文章
	public Article showArticle(int id);
}
