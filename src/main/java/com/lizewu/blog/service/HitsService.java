package com.lizewu.blog.service;

import java.util.Date;

public interface HitsService{
	//ÅÐ¶ÏÊÇ·ñµã»÷¹ý
	public boolean isVisited(int AID,String ip,Date time);
}
