package com.workz.crud;

import com.workz.crud.operator.GinNames;

public class GinStarter {

	public static void main(String[] args) {
		GinNames ginName = new GinNames();

		String gname = ginName.getType();
		System.out.println(gname);
		
		ginName.addGinNames("tanqueray");
		ginName.addGinNames("beefeater");
		ginName.addGinNames("mare");
		ginName.addGinNames("bombay sapphire");
		ginName.displayGinNames();

	}

}
