package com.lizewu.blog.dao;

import java.util.List;

import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.po.Article;

public interface ArticleDao {
	
	//��������
	public void add(Article artical);
	
	
	//չʾ���е�����
	public List<Article> showUserAllArticle(String username);
	
	//��ȡ��������
	public int queryUserAllCount(String username);
	
	//����ҳ����������ѯ������
	public List<Article> queryUserArticleByPage(String username,Page page);
	
	public Article showArticle(int id);
}
