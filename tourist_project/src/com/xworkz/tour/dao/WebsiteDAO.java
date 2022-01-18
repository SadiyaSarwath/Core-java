package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.WebsiteEntity;

public interface WebsiteDAO {
	public void add(WebsiteEntity websiteEntity);

	void add(List<WebsiteEntity> entities);
}
