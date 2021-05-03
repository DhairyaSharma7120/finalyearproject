package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoginVO;

@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List searchLoginByUsername(String username) {
		Session session = this.sessionFactory.getCurrentSession();

		Query q = session.createQuery("from LoginVO where username='"+username+"'");

		List list = q.list();

		return list;
	}

	@Override
	public void saveLogin(LoginVO loginVO) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(loginVO);
		
	}
}
