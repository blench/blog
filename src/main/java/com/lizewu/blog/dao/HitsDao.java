package com.lizewu.blog.dao;

import java.util.Date;
import java.util.List;

import com.lizewu.blog.po.Hits;

public interface HitsDao {
	
	//返回该文章，该时间，该ip的访问记录
	public List<Hits> queryByAID(int AID,String ip, Date time);
	
	
	//添加点击量
	public void addHits(Hits hit);
}
