package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ClothingBrandDAO {

	private Collection<String> clothing = new ArrayList<String>();

	public boolean save(String brand) {
		System.out.println("invoked save method");
		return this.clothing.add(brand);
	}

	public boolean findMatching(String brand) {
		if (brand != null) {
			if (clothing.contains(brand)) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does not match");
		return false;
	}

	public boolean findMatchingCaseSensitive(String brand) {
		Iterator<String> itr = clothing.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.equalsIgnoreCase(brand)) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does not match");
		return false;
	}

	public boolean findMatchingStartswith(String brand) {
		System.out.println("MatchingStartsWith");
		Iterator<String> itr = clothing.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().startsWith(brand.toUpperCase())) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does not match");
		return false;
	}

	public boolean findMatchingendswith(String brand) {
		System.out.println("MatchingEndsWith");
		Iterator<String> itr = clothing.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().endsWith(brand.toUpperCase())) {
				System.out.println("clothing brand name matched");
				return true;
			}
		}
		System.err.println("clothing brand name does not match");
		return false;
	}
}
