class ConverterRunner{
public static void main(String[] values){
String bytevalue="-128";
byte wrappedbyte=Byte.parseByte(bytevalue);
System.out.println(wrappedbyte);

String shortvalue="-32768";
short wrappedshort=Short.parseShort(shortvalue);
System.out.println(wrappedshort);

int value=17;
Integer wrappedvalue=Integer.valueOf(value);
System.out.println(wrappedvalue);

String longvalue="308";
long wrappedlong=Long.parseLong(longvalue);
System.out.println(wrappedlong);

String floatvalue="30.8";
float wrappedfloat=Float.parseFloat(floatvalue);
System.out.println(wrappedfloat);

String doublevalue="120";
double wrappeddouble=Double.parseDouble(doublevalue);
System.out.println(wrappeddouble);

String charvalue="Male";
char wrappedChar=charvalue.charAt(0);
System.out.println(wrappedChar);

String booleanvalue="true";
boolean wrappedboolean=Boolean.parseBoolean(booleanvalue);
System.out.println(wrappedboolean);


}
}