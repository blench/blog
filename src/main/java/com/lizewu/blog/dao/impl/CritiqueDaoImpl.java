package com.lizewu.blog.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lizewu.blog.dao.CritiqueDao;
import com.lizewu.blog.po.Critique;

public class CritiqueDaoImpl extends HibernateDaoSupport implements CritiqueDao {

	@Override
	public void addCritique(Critique crititque) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(crititque);
	}

}
