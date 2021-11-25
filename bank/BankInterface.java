package com.xworkz.java.bank;

public interface BankInterface {
	boolean saveBankData(BankDTO dto);

	BankDTO findIfsc(String ifsccode);

	void displayBankDetails();

}
