package com.xworkz.choco;

import com.xworkz.choco.operator.ChocolateNames;

public class ChocolateStarter {

	public static void main(String[] args) {
		ChocolateNames chocolateName = new ChocolateNames();

		String cname = chocolateName.getBrand();
		System.out.println(cname);

		chocolateName.addChocolateNames("dairy milk");
		chocolateName.addChocolateNames("kit kat");
		chocolateName.addChocolateNames("5 star");
		chocolateName.addChocolateNames("milky bar");
		chocolateName.addChocolateNames("galaxy");
		chocolateName.displayChocolateNames();
		chocolateName.addChocolateNames("sneaker");

	}

}
