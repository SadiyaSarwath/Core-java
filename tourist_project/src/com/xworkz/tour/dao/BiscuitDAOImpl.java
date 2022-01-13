package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.BiscuitEntity;
import com.xworkz.tour.util.EMFUtil;

public class BiscuitDAOImpl implements BiscuitDAO {

	@Override
	public void put(BiscuitEntity biscuitEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(biscuitEntity);
		transaction.commit();
	}

}
