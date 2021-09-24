class Price{
public static float getTotalPrice(String name,int quantity,float price){
System.out.println("getTotalPrice");
System.out.println("name "+name);
System.out.println("quantity "+quantity);
System.out.println("price "+price);
float total=quantity*price;
return total;
}
}