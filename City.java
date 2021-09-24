class CityName{
   public static String getCityNameByPincode(int no){
	if(no==110)
	  {
	    System.out.println("Bangalore");
		return "Bangalore";
	  }
    if(no==111)
	  {
	    System.out.println("Ooty");
		return "Ooty";
	  }
	if(no==112)
	  {
	    System.out.println("Mysore");
		return "Mysore";
	  }
	  return "NA";
  }
}
class City{
	public static void main(String[] values){
	//int no=91;
	//System.out.println("getting the pincode"+no);
	CityName.getCityNameByPincode(112);
}
}
