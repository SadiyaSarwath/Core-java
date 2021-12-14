package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryDAO {
	

	
		private Collection<String> country = new ArrayList<String>();

		public boolean save(String name) {
			return this.country.add(name);
		}

		public boolean findMatching(String name) {
			if (name != null) {
				if (country.contains(name)) {
					System.out.println("country matched");
					return true;
				}
			}
			System.err.println("country doesnt matched");
			return false;
		}
		public boolean findMatchingCaseSensitive(String name) {
			Iterator<String> itr=country.iterator();
			while(itr.hasNext()) {
				String type=itr.next();
				if(type.equalsIgnoreCase(name)) {
				System.out.println("country matched");
				return true;
				}
			}
			
			return false;
		}
		public boolean findMatchingStartswith(String chars) {
			System.out.println("MatchingStartsWith    ");
			Iterator<String> itr=country.iterator();
			while(itr.hasNext()) {
				String type=itr.next();
				if(type.toUpperCase().startsWith(chars.toUpperCase())) {
				System.out.println("country matched");
				return true;
				}
			}
			System.err.println("country doesnt matched");
			return false;
		}
		public boolean findMatchingendswith(String chars) {
			System.out.println("MatchingEndsWith");
			Iterator<String> itr=country.iterator();
			while(itr.hasNext()) {
				String type=itr.next();
				if(type.toUpperCase().endsWith(chars.toUpperCase())) {
				System.out.println("country matched");
				return true;
			}
			}
			System.err.println("country doesnt matched");
			return false;
		}
	}



