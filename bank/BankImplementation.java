package com.xworkz.java.bank;

public class BankImplementation implements BankInterface {
	BankDTO[] dto = new BankDTO[5];
	int count = 0;

	@Override
	public boolean saveBankData(BankDTO bankdto) {
		System.out.println("invoked saveBankData");
		if (bankdto != null) {
			dto[count++] = bankdto;
			return true;

		} else {
			System.err.println("bank dto is null");
		}
		return false;
	}

	@Override
	public BankDTO findIfsc(String ifsccode) {
		System.out.println("invoked IfscCode");
		return null;
	}

	@Override
	public void displayBankDetails() {
		if (dto != null) {

			for (int b = 0; b < dto.length; b++) {

				BankDTO bankDto = dto[b];
				if (bankDto != null) {
					System.out.println(bankDto.getId());
					System.out.println(bankDto.getName());
					System.out.println(bankDto.getIfsc());
					System.out.println(bankDto.getBranch());

				}
			}
		}

	}
}
