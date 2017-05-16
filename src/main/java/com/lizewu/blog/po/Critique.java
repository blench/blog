package com.lizewu.blog.po;

public class Critique {
	
	private int id;
	private int AID;
	private String content;
	private String username;
	public int getId() {
		return id;
	}
	public int getAID() {
		return AID;
	}
	public String getContent() {
		return content;
	}
	public String getUsername() {
		return username;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAID(int aID) {
		AID = aID;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
