package com.xworkz.core;

public class Demo {

			/**
			 * @param args
			 */
			public static void main(String[] args) {
				String name="sad";//constant pool
				boolean contain=name.contains("ad");
				System.out.println("contains ad "+contain);
				
				String branch=new String("BTM");//instance
				boolean containsBT=branch.contains("BT");
				System.out.println(branch.contains("BT"));
				
				char[] chars= {'S','A','D'};
				String convertedString=String.copyValueOf(chars);
				System.out.println(convertedString);
				
				String nagappa="Nagappa";
				String nagamma=new String("Nagamma");
				
				boolean same=nagappa.equals(nagamma);
				System.out.println("SAME : "+same);
				
				char at=nagappa.charAt(5);
				System.out.println(at);
				
				int compare=nagappa.compareTo(nagamma);
				System.out.println(compare);
				
				int length=nagamma.length();
				System.out.println(length);
				
				boolean isEmpty=nagamma.isEmpty();
				System.out.println(isEmpty);
				
				String concat=nagappa.concat(nagamma);
				System.out.println(concat);
				
				
				
				
			}

		

	}


