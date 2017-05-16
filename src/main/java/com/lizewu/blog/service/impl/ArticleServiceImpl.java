package com.lizewu.blog.service.impl;

import java.util.List;

import com.lizewu.blog.dao.ArticleDao;
import com.lizewu.blog.dao.impl.ArticleDaoImpl;
import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.fenye.PageUtil;
import com.lizewu.blog.fenye.Result;
import com.lizewu.blog.po.Article;
import com.lizewu.blog.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	
	private ArticleDao articleDao;
	public ArticleDao getArticleDao() {
		return articleDao;
	}
	public void setArticleDao(ArticleDao articalDao) {
		this.articleDao = articalDao;
	}
	@Override
	public void addArticle(Article article) {
		// TODO Auto-generated method stub
		if(article!=null)
			articleDao.add(article);
	}
	@Override
	public List<Article> showUserAllArticle(String username) {
		// TODO Auto-generated method stub
		return articleDao.showUserAllArticle(username);
	}
	@Override
	public Result showUserArticleByPage(String username, Page page) {
		// TODO Auto-generated method stub
		 List<Article> list = articleDao.queryUserArticleByPage(username, page);
		 page = PageUtil.createPage(page, articleDao.queryUserAllCount(username));
		 Result result = new Result();
		 result.setList(list);
		 page.setCurrentPage(1);
		 result.setPage(page);
		 return result;
	}
	@Override
	public Article showArticle(int id) {
		// TODO Auto-generated method stub
		return articleDao.showArticle(id);
	}

}
