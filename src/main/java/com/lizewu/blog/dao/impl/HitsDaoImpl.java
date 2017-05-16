package com.lizewu.blog.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lizewu.blog.dao.HitsDao;
import com.lizewu.blog.po.Hits;

public class HitsDaoImpl extends HibernateDaoSupport implements HitsDao  {

	@Override
	public List<Hits> queryByAID(final int AID, final String ip, final Date time) {
		// TODO Auto-generated method stub
		// π”√session
		return  (List<Hits>) this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("select hits from Hits hits where hits.AID =? and hits.ip = ? "
						+ "and hits.time = ?" );
				query.setParameter(0, AID);
				query.setParameter(1, ip);
				query.setParameter(2, time);
				return query.list();
			}
		});
	}

	@Override
	public void addHits(Hits hit) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(hit);
	}

}
