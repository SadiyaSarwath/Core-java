package com.xworkz.tour;

import com.xworkz.tour.dao.SugarCaneDAO;
import com.xworkz.tour.dao.SugarCaneDAOImpl;
import com.xworkz.tour.entity.SugarCaneEntity;

public class SugarCaneStarter {
	public static void main(String[] args) {

		SugarCaneEntity caneEntity=new SugarCaneEntity(1, "gavthi", "kannad", 500, "kannad");
		
		SugarCaneDAO caneDAO=new SugarCaneDAOImpl();
		caneDAO.put(caneEntity);
	
	}
}
