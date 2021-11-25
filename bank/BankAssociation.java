package com.xworkz.java.bank;

public class BankAssociation {
	BankInterface dao;

	public BankAssociation(BankInterface dao) {
		super();
		this.dao = dao;

	}

	public void saveBank(BankDTO dto) {
		if (dto != null && dao.saveBankData(dto)) {
			System.out.println("invoked saveBankData");

		} else {
			System.err.println("dto is pointing to null");
		}

	}

	public void getIfsc(BankDTO dto) {
		if (dto != null) {
			System.out.println(dto.getIfsc());
		}

	}

	public void displayDetails() {
		if (dao != null) {
			dao.displayBankDetails();
		}
	}

}
