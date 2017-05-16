package com.lizewu.blog.fenye;

import java.util.List;

import com.lizewu.blog.po.Article;

public class Result {
	
	private Page page;
	private List<Article> list;
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<Article> getList() {
		return list;
	}
	public void setList(List<Article> list) {
		this.list = list;
	}
}
