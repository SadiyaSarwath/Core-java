package com.xworkz.company.dao;

import com.xworkz.company.entity.CityEntity;

public interface CityDAO {
	public void create(CityEntity entity);

	CityEntity getById(int Id);
}
