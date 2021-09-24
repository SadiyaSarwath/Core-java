class MatchBoxRunner{
public static void main(String[] args){

String brand="Homelite";

MatchBox box=new MatchBox(brand);
System.out.println(box.brand);
System.out.println(box.noOfSticks);
box.size=BoxSize.SMALL;
System.out.println(box.size);
System.out.println(box.empty);


}
}