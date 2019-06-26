class Parent{
	int age;
	void play() {System.out.println("");}
	
}
class Child extends Parent{
	String name;
	void play() {System.out.println("더더놀고먹자");}//매서드 오버 라이딩 그래서 덮어써서 parent play를 덮어씀
	void earn() {System.out.println("더먹자");}
}
class TestIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child1 = new Child();
		child1.age = 10;
		child1.play();
		child1.earn();
		Parent p = new Child();
		p.play();
		
		Child p2 = (Child)p;
		p2.earn();
	}

}
