package com.xworkz.company.dao;

import com.xworkz.company.entity.StateEntity;

public interface StateInterface {
	public void create(StateEntity entity);

	public StateEntity getById(int Id);

	default void updateCapitalCity(String newCity, int id) {
		return;
	}

	default void updateDestinationById(String newDest, int id) {

	}

	default void delete(int Id) {

	}

}
