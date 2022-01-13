package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.RailwayStationEntity;
import com.xworkz.tour.util.EMFUtil;

public class RailwayStationDAOImpl implements RailwayStationDAO {

	@Override
	public void put(RailwayStationEntity railwayStationEntity) {
		EntityManagerFactory entityManagerFactory = EMFUtil.getEntityManagerFactory();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(railwayStationEntity);
		entityTransaction.commit();
	}

}
