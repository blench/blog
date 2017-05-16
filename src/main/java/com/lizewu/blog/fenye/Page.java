package com.lizewu.blog.fenye;

import java.util.concurrent.ConcurrentHashMap;

public class Page<K, V> {
	
	private ConcurrentHashMap<K, V> map;
	//每页显示数量
	private int everyPage;
	//总记录数
	private int totalCount;
	//总页数
	private int totalPage;
	//起始页
	private int beginIndex;
	//当前页
	private int currentPage;
	//是否有上一页
	private boolean hasPrePage;
	//是否有下一页
	private boolean hasNextPage;
	public int getEveryPage() {
		return everyPage;
	}
	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getBeginIndex() {
		return beginIndex;
	}
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public boolean isHasPrePage() {
		return hasPrePage;
	}
	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	
	public Page(int everyPage, int totalCount, int totalPage, int beginIndex, int currentPage, boolean hasPrePage,
			boolean hasNextPage) {
		this.everyPage = everyPage;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.beginIndex = beginIndex;
		this.currentPage = currentPage;
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
	}
	public Page() {
	}
	
}
