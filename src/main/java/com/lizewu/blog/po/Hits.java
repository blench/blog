package com.lizewu.blog.po;

import java.util.Date;

public class Hits {
	//文章的id
	private int ID;
	//自增序列
	private int AID;
	//访问IP字段
	private String ip;
	private Date time;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAID() {
		return AID;
	}
	public void setAID(int aID) {
		AID = aID;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
 