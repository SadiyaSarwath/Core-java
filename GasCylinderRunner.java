class GasCylinderRunner{
public static void main(String[] args){

float price=920f;
float weight=15.3f;

GasCylinder cylinder=new GasCylinder(price,weight);
System.out.println(cylinder.price);
System.out.println(cylinder.weight);
System.out.println(cylinder.cylinderNo);
cylinder.company=CylinderCompany.HP;
System.out.println(cylinder.company);
cylinder.size=CylinderSize.MEDIUM;
System.out.println(cylinder.size);

}
}