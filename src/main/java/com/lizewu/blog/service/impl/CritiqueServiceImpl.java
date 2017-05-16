package com.lizewu.blog.service.impl;

import com.lizewu.blog.dao.CritiqueDao;
import com.lizewu.blog.dao.impl.CritiqueDaoImpl;
import com.lizewu.blog.po.Critique;
import com.lizewu.blog.service.CritiqueService;

public class CritiqueServiceImpl implements CritiqueService {
	
	private CritiqueDao critiqueDao;
	@Override
	public void addCritique(Critique critique) {
		// TODO Auto-generated method stub

	}
	public CritiqueDao getCritiqueDao() {
		return critiqueDao;
	}
	public void setCritiqueDao(CritiqueDao critiqueDao) {
		this.critiqueDao = critiqueDao;
	}

}
