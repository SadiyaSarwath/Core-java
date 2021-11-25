package com.xworkz.java.bank;

public class BankRunner {
	public static void main(String[] args) {
		BankDTO ref1 = new BankDTO("2298", "sadi", "IFSC2385", "BTM LAYOUT");
		BankInterface ref2 = new BankImplementation();
		BankAssociation ref3 = new BankAssociation(ref2);
		ref3.saveBank(ref1);
		ref3.getIfsc(ref1);
		ref3.displayDetails();

	}

}
