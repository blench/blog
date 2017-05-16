package com.lizewu.blog.action;

import java.util.Date;
import java.util.Map;

import com.lizewu.blog.po.Article;
import com.lizewu.blog.service.ArticleService;
import com.lizewu.blog.service.impl.ArticleServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddArticle extends ActionSupport {
	
	private Article article;
	
	private ArticleService articleService;
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article artical) {
		this.article = artical;
	}
	public ArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		article.setUsername(username);
		article.setDate(new Date());
		article.setHasRead(0);
		articleService.addArticle(article);
		return SUCCESS;
	}
}
