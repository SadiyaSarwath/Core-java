package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.StateEntity;

public class StateDAOImpl implements StateDAO {

	@Override
	public void create(StateEntity entity) {

		System.out.println("invoked create dao method");
		System.out.println("to print entity".concat(entity.toString()));
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		if (sessionFactory != null) {
			Session session = sessionFactory.openSession();
			Transaction t = session.beginTransaction();
			session.save(entity);
			t.commit();
			session.close();

		}
		sessionFactory.close();
	}

}