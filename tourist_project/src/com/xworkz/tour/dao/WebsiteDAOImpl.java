package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.WebsiteEntity;
import com.xworkz.tour.util.EMFUtil;

public class WebsiteDAOImpl implements WebsiteDAO {

	@Override

	public void add(List<WebsiteEntity> entities) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		manager.getTransaction().begin();

		int flushcount = 0;
		try {
			for (WebsiteEntity webSiteEntity : entities) {
				manager.persist(webSiteEntity);

				if (flushcount == 10) {
					manager.flush();
					flushcount = 0;
					manager.clear();

				}
				flushcount++;

			}
			manager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		}
	}

	@Override
	public void add(WebsiteEntity entity) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();

	}

}