class Parent{
	int age;
	void play() {System.out.println("");}
	
}
class Child extends Parent{
	String name;
	void play() {System.out.println("����������");}//�ż��� ���� ���̵� �׷��� ����Ἥ parent play�� ���
	void earn() {System.out.println("������");}
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
