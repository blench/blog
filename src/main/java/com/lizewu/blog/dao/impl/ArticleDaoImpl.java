package com.lizewu.blog.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lizewu.blog.dao.ArticleDao;
import com.lizewu.blog.fenye.Page;
import com.lizewu.blog.po.Article;

public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {

	@Override
	public void add(Article artical) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(artical);
	}

	@Override
	public List<Article> showUserAllArticle(String username) {
		// TODO Auto-generated method stub
		List<Article> list = (List<Article>) this.getHibernateTemplate().find("selcet art from Article where art.username = ?", username);
		return list.size()==0?null:list;
	}

	@Override
	public int queryUserAllCount(String username) {
		// TODO Auto-generated method stub
		List list =  this.getHibernateTemplate().find("select count(*) from Article art where art.username = ? ", username);
		return ((Long)list.get(0)).intValue();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Article> queryUserArticleByPage(final String username,final Page page) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("select art from Article art where art.username = ?");
				query.setParameter(0, username);
				//设置起点
				query.setFirstResult(page.getBeginIndex());
				//设置每页显示多少，设置最大页数
				query.setMaxResults(page.getEveryPage());
				return query.list();
			}
		});
		
	}

	@Override
	public Article showArticle(int id) {
		// TODO Auto-generated method stub
		return (Article) this.getHibernateTemplate().find("select art from Article art where art.id = ?", id).get(0);
	}

}
