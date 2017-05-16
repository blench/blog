package com.lizewu.blog.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.fenye.Result;
import com.lizewu.blog.po.Article;
import com.lizewu.blog.service.ArticleService;
import com.lizewu.blog.service.impl.ArticleServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserAllArticle extends ActionSupport {
	
	private ArticleService articleService;
	private Page page;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		System.out.println(username);
//		List<Article> all1 = articleService.showUserAllArticle(username);
		HttpServletRequest request = ServletActionContext.getRequest();
		page.setEveryPage(5);
		//使用一个封装类实现username和page
		Result result =  articleService.showUserArticleByPage(username, page);
		page = result.getPage();
		
		List<Article> all = result.getList();
		request.setAttribute("all", all);
		request.setAttribute("page", page);
		return SUCCESS;
	}
	public ArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
}
