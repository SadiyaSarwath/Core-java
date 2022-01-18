package com.xworkz.tour;

import com.xworkz.tour.dao.WebsiteDAO;
import com.xworkz.tour.dao.WebsiteDAOImpl;
import com.xworkz.tour.entity.WebsiteEntity;

public class WebsiteStarter {

	public static void main(String[] args) {
		WebsiteEntity entity1 = new WebsiteEntity("Google", "www.goole.com", 1994, "Sadiya", ".com");

		WebsiteDAO dao = new WebsiteDAOImpl();
		dao.add(entity1);
		dao.add(new WebsiteEntity("CNN", "www.CNN.com", 2004, "sadia", ".com"));
		dao.add(new WebsiteEntity("linkedin", "www.linkedin.org", 2003, "saddy", ".org"));
		dao.add(new WebsiteEntity("instagram", "www.instagam.com", 1998, "sadiya", ".com"));
		dao.add(new WebsiteEntity("intuit", "www.intuit.com", 2000, "sadu", ".com"));
		dao.add(new WebsiteEntity("microsoft", "www.microsoft.com", 2005, "sadi", ".com"));
		dao.add(new WebsiteEntity("cloudflare", "www.cloudflare.in", 2002, "saddy", ".in"));
		dao.add(new WebsiteEntity("w3schools", "www.w3schools.in", 2010, "sadiya", ".in"));
		dao.add(new WebsiteEntity("Amazon", "www.amazon.com", 2005, "sadiya", ".com"));
		dao.add(new WebsiteEntity("Facebook", "www.Facebook.com", 1997, "sadiya", ".com"));
		dao.add(new WebsiteEntity("Yahoo", "www.Yahoo.com", 2002, "sadiya", ".com"));
		dao.add(new WebsiteEntity("Reddit", "www.Reddit.org", 2005, "sadiya", ".org"));
		dao.add(new WebsiteEntity("wikipidia", "www.wikipidia.org", 1999, "sadia", ".org"));
		dao.add(new WebsiteEntity("ebay", "www.ebay.com", 2001, "saddy", ".com"));
		dao.add(new WebsiteEntity("bing", "www.bing.org", 2005, "sadi", ".org"));
		dao.add(new WebsiteEntity("netflix", "www.netflix.com", 2000, "saddy", ".com"));
		dao.add(new WebsiteEntity("office", "www.office.org", 2005, "sad", ".org"));
		dao.add(new WebsiteEntity("instructure", "www.instructure.com", 1994, "sadi", ".com"));
		dao.add(new WebsiteEntity("shopify", "www.shopify.com", 2005, "sadiya", ".com"));
		dao.add(new WebsiteEntity("twitch", "www.twitch.org", 2013, "sadi", ".org"));

	}

}