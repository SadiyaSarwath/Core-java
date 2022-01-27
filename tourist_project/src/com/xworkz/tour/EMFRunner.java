package com.xworkz.tour;

import javax.persistence.EntityManager;

import com.xworkz.singleton.EMFUtil;

public class EMFRunner {

	public static void main(String[] args) {
	EntityManager em=EMFUtil.getEmf().createEntityManager();
	System.out.println(em);

	}

}
