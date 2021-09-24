class Mobile{
	public static float getTotalPrice(String brand,String color,String model,float price,int quantity,int imei,String country){
		System.out.println("Brand of Mobile:"+brand+"\n"+"Color:"+color+"\n"+"Model"+model+"\n"+"Price:"+price+"rs"+"\n"+"Quantity:"+quantity+" nos"+"\n"+"IMEI:"+imei+"\n"+"Country:"+country);
		float totalPrice=price*quantity;
		return totalPrice;
	}
	public static void main(String[] args){
		System.out.println("Total Price="+getTotalPrice("Iphone","Red","6S",65000,5,456456456,"India"));
		System.out.println("Total Price="+getTotalPrice("Realme","Grey","12 Pro",25000,8,456113446,"India"));
		System.out.println("Total Price="+getTotalPrice("Samsung","Blue","S20",90000,11,123456456,"South Korea"));
		System.out.println("Total Price="+getTotalPrice("One-Plus","black","8",45000,15,156458956,"India"));
		System.out.println("Total Price="+getTotalPrice("Redmi","Space Grey","12 Pro Max",70000,7,896456456,"India"));
		
		}
		
}