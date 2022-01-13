package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.SugarCaneEntity;
import com.xworkz.tour.util.EMFUtil;

public class SugarCaneDAOImpl implements SugarCaneDAO {

	@Override
	public void put(SugarCaneEntity caneEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(caneEntity);
		entityTransaction.commit();

	}
}
