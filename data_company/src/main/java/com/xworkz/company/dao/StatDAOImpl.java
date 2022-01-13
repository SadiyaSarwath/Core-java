package com.xworkz.company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.StateEntity;

public class StatDAOImpl implements StateInterface {

	@Override
	public void create(StateEntity entity) {

		System.out.println(entity);
		System.out.println("invoked the create entity");
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(StateEntity.class);
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			System.out.println("factory is not null");
			Session session = factory.openSession();
			session.save(entity);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			session.close();
		}
		factory.close();
		System.out.println("all method is closed");
	}

	@Override
	public StateEntity getById(int Id) {

		StateEntity entity = null;
		System.out.println("invoked the getById");
		System.out.println("id passed as :" + Id);
		Configuration configuration = new Configuration().configure().addAnnotatedClass(StateEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			entity = session.get(StateEntity.class, Id);
			if (entity != null) {
				System.out.println("entity found as id:" + Id);
			} else {
				System.out.println("entity is not found as id:" + Id);
			}
			session.close();
		}
		factory.close();
		return entity;
	}

	@Override
	public void updateCapitalCity(String newCity, int id) {
		System.out.println("invoked update new capital city");
		System.out.println(newCity + " " + id);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(StateEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			StateEntity entity = session.get(StateEntity.class, id);
			if (entity != null) {
				entity.setCapitalCity(newCity);
				session.update(entity);
				transaction.commit();
				System.out.println("update capital city:" + id);
				session.close();
			}
			factory.close();
		}
	}

	@Override
	public void delete(int Id) {
		System.out.println("invoked the delete row");
		System.out.println(Id);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(StateEntity.class)
				.buildSessionFactory();
		if (factory != null) {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			StateEntity entity = session.get(StateEntity.class, Id);
			if (entity != null) {
				entity.setId(Id);
				session.delete(entity);
				transaction.commit();
				System.out.println("delete entity id:" + Id);
			} else {
				System.out.println("not deleted");
			}
			session.close();
		}
		factory.close();
	}
}
