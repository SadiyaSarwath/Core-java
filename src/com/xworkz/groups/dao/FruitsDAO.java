package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FruitsDAO {
	private Collection<String> fruits = new ArrayList<String>();

	public boolean save(String name) {
		
		return this.fruits.add(name);
	}

	public boolean findMatching(String name) {
		if (name != null) {
			if (fruits.contains(name)) {
				System.out.println("fruit name matched");
				return true;
			}
		}
		System.err.println("fruit name does not match");
		return false;
	}

	public boolean findMatchingCaseSensitive(String name) {
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.equalsIgnoreCase(name)) {
				System.out.println("fruit name matched");
				return true;
			}
		}
		System.err.println("fruit name does not match");
		return false;
	}

	public boolean findMatchingStartswith(String name) {
		System.out.println("MatchingStartsWith");
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().startsWith(name.toUpperCase())) {
				System.out.println("fruit name matched");
				return true;
			}
		}
		System.err.println("fruit name does not match");
		return false;
	}

	public boolean findMatchingendswith(String name) {
		System.out.println("MatchingEndsWith");
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			String type = itr.next();
			if (type.toUpperCase().endsWith(name.toUpperCase())) {
				System.out.println("fruit name matched");
				return true;
			}
		}
		System.err.println("fruit name does not match");
		return false;
	}
}
