package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlaceDAO {
	private Collection<String> places = new ArrayList<String>();

	public boolean save(String name) {
		return this.places.add(name);
	}

	public boolean findMatching(String place) {
		if (place != null) {
			if (places.contains(place)) {
				System.out.println("place matched");
				return true;
			}
		}
		System.err.println("place not matched");
		return false;
	}
	public boolean findMatchingCaseSensitive(String name) {
		Iterator<String> itr=places.iterator();
		while(itr.hasNext()) {
			String type=itr.next();
			if(type.equalsIgnoreCase(name)) {
			System.out.println("place matched");
			return true;
			}
		}
		
		return false;
	}
	public boolean findMatchingStartswith(String chars) {
		System.out.println("MatchingStartsWith    ");
		Iterator<String> itr=places.iterator();
		while(itr.hasNext()) {
			String type=itr.next();
			if(type.toUpperCase().startsWith(chars.toUpperCase())) {
			System.out.println("place matched");
			return true;
			}
		}
		
		return false;
	}
	public boolean findMatchingendswith(String chars) {
		System.out.println("MatchingEndsWith");
		Iterator<String> itr=places.iterator();
		while(itr.hasNext()) {
			String type=itr.next();
			if(type.toUpperCase().endsWith(chars.toUpperCase())) {
			System.out.println("place matched");
			return true;
		}
		}
		
		return false;
	}
}
