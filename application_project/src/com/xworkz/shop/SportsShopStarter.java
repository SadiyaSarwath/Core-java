package com.xworkz.shop;

import java.time.LocalDateTime;

import com.xworkz.shop.dao.SportsShopDAO;
import com.xworkz.shop.dao.SportsShopDAOImpl;
import com.xworkz.shop.dto.SportsShopEntity;
import com.xworkz.shop.sportService.SportShopService;
import com.xworkz.shop.sportService.SportShopServiceImpl;

public class SportsShopStarter {

	public static void main(String[] args) {
		SportsShopEntity shopEntity = new SportsShopEntity("Sadiya", "Sarwath", "sad@17", "sad@17",
				"#61/25 9th A Main BTM Layout", 9916113208l, "sad17@gmail.com", 21, 560029, "sadiya sarwath",
				LocalDateTime.now(), "Sadiya Sarwath", LocalDateTime.now());
		SportsShopEntity shopEntity1 = new SportsShopEntity("Rakesh", "M P", "rocky@17", "rocky@17",
				"#22 , Basavanagar,Kunchenur Road,Jamkandi", 9884872645l, "rockyy17@gmail.com", 25, 587301,
				"sadiya sarwath", LocalDateTime.now(), null, null);
		SportsShopEntity shopEntity2 = new SportsShopEntity("Abhijeet", "Badjugar", "abhi@12", "abhi@12",
				"#89 2nd cross domlur", 9987452142l, "abhi18@gmail.com", 23, 560169, "sadiya sarwath",
				LocalDateTime.now(), "Sadiya Sarwath", LocalDateTime.now());
		SportsShopEntity shopEntity3 = new SportsShopEntity("B", "Savitha", "savi@1829", "savi@1829",
				"#1829 murgeshpalaya", 9742589635l, "savi1829@gmail.com", 21, 560017, "sadiya sarwath",
				LocalDateTime.now(), "Sadiya Sarwath", LocalDateTime.now());
		SportsShopEntity shopEntity4 = new SportsShopEntity("Sahana", "G P", "sahana@2", "sahana@2",
				"#51 bharathi nagar, Mandya", 9110812483l, "sahana2@gmail.com", 22, 571422, "sadiya sarwath",
				LocalDateTime.now(), "Sadiya Sarwath", LocalDateTime.now());
		SportsShopEntity shopEntity5 = new SportsShopEntity("Avila", "B S", "avila@12", "avila@12",
				"shubhash nagar,virajpet", 9971354785l, "avila12@gmail.com", 22, 571218, "sadiya sarwath",
				LocalDateTime.now(), "Sadiya Sarwath", LocalDateTime.now());

		SportsShopDAO dao = new SportsShopDAOImpl();
		dao.save(shopEntity);
		dao.save(shopEntity2);
		dao.save(shopEntity3);
		dao.save(shopEntity4);
		dao.save(shopEntity5);
		SportShopService sportshop = new SportShopServiceImpl(dao);
		sportshop.validateAndSave(shopEntity);
		sportshop.validateAndSave(shopEntity1);
		sportshop.validateAndSave(shopEntity2);
		sportshop.validateAndSave(shopEntity3);
		sportshop.validateAndSave(shopEntity4);
		sportshop.validateAndSave(shopEntity5);

	}
}
