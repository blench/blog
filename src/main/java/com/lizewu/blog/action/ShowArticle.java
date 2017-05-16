package com.lizewu.blog.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.lizewu.blog.po.Article;
import com.lizewu.blog.service.ArticleService;
import com.lizewu.blog.service.HitsService;
import com.lizewu.blog.service.impl.ArticleServiceImpl;
import com.lizewu.blog.service.impl.HitsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ShowArticle extends ActionSupport {
	
	private ArticleService articleService;
	
	
	private HitsService hitsService;
	private int id;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Article article = articleService.showArticle(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		
		//得到ip地址
		String ip = request.getRemoteAddr();
		System.out.println(ip);
		//将日期转换为标准格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String stime = sdf.format(new Date());
		Date time = sdf.parse(stime);
		if(!hitsService.isVisited(id, ip, time))
		{
			article.setHasRead(article.getHasRead()+1);
		}
		articleService.addArticle(article);
		request.setAttribute("article", article);
		return this.SUCCESS;
	}
	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HitsService getHitsService() {
		return hitsService;
	}
	public void setHitsService(HitsService hitsService) {
		this.hitsService = hitsService;
	}
	
}
