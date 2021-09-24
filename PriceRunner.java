class PriceRunner{
public static void main(String[] rate){
String name=rate[0];
int quantity=rate[1];
float price=rate[2];
float total=Price.getTotalPrice(name,quantity,price);
System.out.println("Total Price"+total);
}
}