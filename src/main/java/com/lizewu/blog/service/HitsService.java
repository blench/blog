package com.lizewu.blog.service;

import java.util.Date;

public interface HitsService{
	//�ж��Ƿ�����
	public boolean isVisited(int AID,String ip,Date time);
}
