class PrintMail{
static void pnamemail(){
System.out.println("sadiya");
System.out.println("sadiyasarwath451@gmail.com");
}
static void pnamemail(String name){
	System.out.println(name);

}
static void pnammail(String mail){
	System.out.println(mail);
}
static void countrystatecityarea(){
System.out.println("india");
System.out.println("karnataka");
System.out.println("bangalore");
System.out.println("btmlayout");
}
}
class Favourite{
static void fav(){
System.out.println("sidharth");
System.out.println("shershah");
}
static void placecountry(){
System.out.println("paris");
System.out.println("new york");
}
static void job(){
System.out.println("Work as Software Developer");
}
}
class Runner{
public static void main(String[] run){
PrintMail.pnamemail();
PrintMail.countrystatecityarea();
Favourite.fav();
Favourite.placecountry();
Favourite.job();
PrintMail.pnamemail("sadi");
PrintMail.pnamemail("sadiyasarwath451@gmail.com");
}
}