package com.xworkz.company.dao;

import com.xworkz.company.entity.StateEntity;

public class StateStarter {
	public static void main(String[] args) {

		StateEntity stateEntity = new StateEntity(12, "goa", 1, "panji");
		StateEntity stateEntity1 = new StateEntity(23, "maharashta", 28, "mumbai");
		StateEntity stateEntity2 = new StateEntity(33, "karnakata", 24, "bangalore");
		StateEntity stateEntity3 = new StateEntity(44, "punjab", 18, "amrutsar");
		StateEntity stateEntity4 = new StateEntity(55, "gujrat", 23, "gandhi nagar");
		StateInterface stateInterface = new StatDAOImpl();
		// stateInterface.create(stateEntity);
//		stateInterface.create(stateEntity1);
//		stateInterface.create(stateEntity2);
//		stateInterface.create(stateEntity3);
//		stateInterface.create(stateEntity4);
//		StateEntity s_entity=stateInterface.getById(44);
//		System.out.println("get state id:"+s_entity);
//		stateInterface.updateCapitalCity("maha",23);
		stateInterface.delete(22);
	}

}
