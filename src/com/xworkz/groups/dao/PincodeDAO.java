package com.xworkz.groups.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PincodeDAO {

	private Collection<Integer> pincode = new ArrayList<Integer>();

	public boolean save(int number) {
		return this.pincode.add(number);
	}

	public boolean findMatching(int match) {
		if (match != 0) {
			if (pincode.contains(match)) {
				System.out.println("pincode number matched");
				return true;
			}
		}
		System.err.println("pincode number does not match");
		return false;
	}

	public boolean findMatchingStartsWithChars(int startsWith) {
		String convert = Integer.toString(startsWith);
		if (startsWith != 0) {
			Iterator<Integer> itr = pincode.iterator();
			while (itr.hasNext()) {
				int type = itr.next();
				String s = Integer.toString(type);
				// if(s.toUpperCase().startsWith(convert.toUpperCase())){ --OR--
				if (s.startsWith(convert)) {
					System.out.println("pincode number matched...");
					return true;
				}
			}
			System.err.println("pincode number does not matched...");
		}

		return false;

	}

	public boolean findMatchingEndsWithChars(int endsWith) {
		String convert = Integer.toString(endsWith);
		if (endsWith != 0) {
			Iterator<Integer> itr = pincode.iterator();
			while (itr.hasNext()) {
				int type = itr.next();
				String str = Integer.toString(type);

				if (str.endsWith(convert)) {
					System.out.println("pincode number matched");
					return true;
				}
			}
			System.err.println("pincode number does not matched");
		}
		return false;
	}

}
