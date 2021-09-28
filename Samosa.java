class Samosa{
 
 float cost;
 boolean taste;
 SamosaSize size;
 String[] ingredients;
 Samosa(float cost,boolean taste)
 {
    this.cost=cost;
	this.taste=taste;
 }
Samosa(SamosaSize size,String[] ingredients)
{
	this.size=size;
	this.ingredients=ingredients;
}
Samosa(float cost,boolean taste,SamosaSize Size,String[] ingredients)
{
	this(cost,taste);
	this.size=size;
	this.ingredients=ingredients;
}


}