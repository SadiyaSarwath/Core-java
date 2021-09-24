class Country{
   public static String getCountryByPincode(int no){
	if(no==91)
	  {
	    System.out.println("India");
		return "India";
	  }
    if(no==010)
	  {
	    System.out.println("South Korea");
		return "South Korea";
	  }
	if(no==92)
	  {
	    System.out.println("Pakistan");
		return "Pakistan";
	  }
	  return "NA";
  }
}

