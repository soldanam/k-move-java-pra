class BindingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println("p.x = "+p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();

	}

}
class Parent1{
	int x = 100 ;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child1 extends Parent1{}
