package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.SilkManufactureEntity;
import com.xworkz.tour.util.EMFUtil;

public class SilkManufactureDAOImpl implements SilManufactureDAO {
	public void put(SilkManufactureEntity manufactureEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(manufactureEntity);
		entityTransaction.commit();
	}
}
