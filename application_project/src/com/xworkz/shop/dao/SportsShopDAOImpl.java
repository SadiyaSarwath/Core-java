package com.xworkz.shop.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.shop.dto.SportsShopEntity;
import com.xworkz.shop.util.EMFUtil;

public class SportsShopDAOImpl implements SportsShopDAO {

	@Override
	public void save(SportsShopEntity entity) {

		EntityManager entityManager = EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(entity);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

}
