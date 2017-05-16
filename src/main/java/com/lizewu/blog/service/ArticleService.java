package com.lizewu.blog.service;

import java.util.List;

import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.fenye.Result;
import com.lizewu.blog.po.Article;

public interface ArticleService {
	
	//�������
	public void addArticle(Article article);
	

	//չʾ���е�����
	public List<Article> showUserAllArticle(String username);
	
	
	//��ҳ��ʾ�û�����
	public Result showUserArticleByPage(String username,Page page);
	
	//չʾ�û�������
	public Article showArticle(int id);
}
