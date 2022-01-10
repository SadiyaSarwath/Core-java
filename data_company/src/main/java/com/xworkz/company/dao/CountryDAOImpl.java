package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CountryEntity;

public class CountryDAOImpl implements CountryDAO {
	

		@Override
		public void create(CountryEntity entity) {
			System.out.println("invoked create dao method");
			System.out.println("to print entity".concat(entity.toString()));
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(CountryEntity.class);
			SessionFactory sessionFactory=configuration.buildSessionFactory();
					if(sessionFactory!=null) {
					Session session=sessionFactory.openSession();
					Transaction t=session.beginTransaction();
					session.save(entity);
					t.commit();
					session.close();
					
					
					}
			sessionFactory.close();
		}

		
}
