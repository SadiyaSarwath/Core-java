class Jail{
String location;
String name;
int noOfCells;
int noOfCriminals;
int personnel;
float areaInAcres;
int yearOfConstruction;
boolean strict;
Jail(String location,String name,int yearOfConstruction)
{
this.location=location;
this.name=name;
this.yearOfConstruction=yearOfConstruction;
this.noOfCells=50;
this.noOfCriminals=100;
this.personnel=50;
this.areaInAcres=3;
System.out.println("created with string,string,int");
System.out.println(this.noOfCells==this.personnel);
}


Jail()
{
	
}


}