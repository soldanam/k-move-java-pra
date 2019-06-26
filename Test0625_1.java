class Tv{
	String color=null;
	
	Tv(){}
	Tv(Tv t){this.color = t.color;}
	void setColor(Tv t) {
		this.color=t.color;
		
	}
	void setColor(String color) {//method overload
		this.color= color;
	}
	String getColor() {
		return color;
	}
	
	
}
class Test0625_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv(t2);
		String s = t3.getColor();
		System.out.println(s);
		
		Tv[] tvarr = new Tv[3];
		System.out.println(tvarr[0]);
		tvarr[0]= new Tv();
		tvarr[0].setColor("yellow");
		System.out.println(tvarr[0].color);
		

	}
	

}
