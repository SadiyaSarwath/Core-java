package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class PincodeDAO {

		
			private Collection<Integer> pincode = new ArrayList<Integer>();

			public boolean save(int number) {
				return this.pincode.add(number);
			}

			public boolean findMatching(int number) {
				if (number!= 0) {
					if (pincode.contains(number)) {
						System.out.println("pincode number matched");
						return true;
					}
				}
				System.err.println("pincode number does not match");
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





}
