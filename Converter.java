class Converter{
public static void main(String[] vals){
String acres="1500";
double wrappedacres=Double.parseDouble(acres);
System.out.println(wrappedacres);

String rupees="120";
double wrappedrupees=Double.parseDouble(rupees);
System.out.println(wrappedrupees);

int price=100;
Integer wrappedmango=Integer.valueOf(price);
System.out.println(wrappedmango);

String gender="Female";
char wrappedChar=gender.charAt(0);
System.out.println(wrappedChar);
}
}