package com.lizewu.blog.service.impl;

import java.util.Date;
import java.util.List;

import com.lizewu.blog.dao.HitsDao;
import com.lizewu.blog.dao.impl.HitsDaoImpl;
import com.lizewu.blog.po.Hits;
import com.lizewu.blog.service.HitsService;

public class HitsServiceImpl implements HitsService {
	
	private HitsDao hitsDao;
	public HitsDao getHitsDao() {
		return hitsDao;
	}
	public void setHitsDao(HitsDao hitsDao) {
		this.hitsDao = hitsDao;
	}
	@Override
	public boolean isVisited(int AID, String ip, Date time) {
		// TODO Auto-generated method stub
		List<Hits> list = hitsDao.queryByAID(AID, ip, time);
		Hits hits = null;
		//当list.size()不为零时
		if(list.size()!=0)
		{
			return true;
		}else
		{
			hits = new Hits();
			hits.setAID(AID);
			hits.setIp(ip);
			hits.setTime(time);
			//保存记录
			hitsDao.addHits(hits);
			return false;
		}
	}

}
