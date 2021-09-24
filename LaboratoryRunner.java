class LaboratoryRunner{
public static void main(String[] args){

String name="CS";
String location="3 rd floor";
int noOfRooms=2;
String op1="sad";
String op2="sadiya";
String op3="sadi";
String[] operatorNames={op1,op2,op3};

Laboratory lab=new Laboratory(name,location,noOfRooms,operatorNames);
System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.noOfRooms);
System.out.println(operatorNames[0]);
System.out.println(lab.type);
lab.type=LabType.MECH;
System.out.println(lab.type);

}
}