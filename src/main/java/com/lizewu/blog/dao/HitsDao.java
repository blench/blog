package com.lizewu.blog.dao;

import java.util.Date;
import java.util.List;

import com.lizewu.blog.po.Hits;

public interface HitsDao {
	
	//���ظ����£���ʱ�䣬��ip�ķ��ʼ�¼
	public List<Hits> queryByAID(int AID,String ip, Date time);
	
	
	//��ӵ����
	public void addHits(Hits hit);
}
