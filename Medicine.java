class Medicine{
	public static float getTotalPrice(String name,String company,float price,int quantity){
		System.out.println("Name of the Medicine:"+name+"\n"+"Company:"+company+"\n"+"Price:"+price+"rs"+"\n"+"Quantity:"+quantity+" nos");
		float totalPrice=price*quantity;
		return totalPrice;
	}
	public static void main(String[] args){
		
		System.out.println("Total Price="+getTotalPrice("TADOL","Daksh Pharmaceuticals Private Limited",156,10)+"rs");
		System.out.println("Total Price="+getTotalPrice("OXIDIN 300","Daksh Pharmaceuticals Private Limited",128,13)+"rs");
		System.out.println("Total Price="+getTotalPrice("SOLO","Daksh Pharmaceuticals Private Limited",48,4)+"rs");
		System.out.println("Total Price="+getTotalPrice("D-GUT","Daksh Pharmaceuticals Private Limited",108,11)+"rs");
		System.out.println("Total Price="+getTotalPrice("ZORAX 500","Daksh Pharmaceuticals Private Limited",98,3)+"rs");

		}
		
}