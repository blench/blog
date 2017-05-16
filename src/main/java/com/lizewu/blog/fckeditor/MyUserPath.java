package com.lizewu.blog.fckeditor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.fckeditor.requestcycle.UserPathBuilder;

public class MyUserPath implements UserPathBuilder {

	@Override
	public String getUserFilesPath(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		return "/userfiles/"+username;
	}

}
