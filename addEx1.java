//interface�� �����Ͽ� ó�� - �͸� Ŭ����
interface InterB{
	void add(int a, int b);
}
class Outer3{//��ư
	InterB addInt() {//��ư ������. �͸�Ŭ���� -local Ŭ����
		return new InterB() {//�̺�Ʈ
			//��ư �̺�Ʈ �ϴ� ��
			public void add(int a, int b) {//Object ��� ����. object�ȿ� add �Լ� ����. �׷��� �ϳ��� ���� �������.
				System.out.println("a�� b�� ��: "+(a+b));
				}
		};
	}
}
class addEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 outer = new Outer3();
		InterB inter = outer.addInt();
		inter.add(3,4);
		

	}

}
//    -------------          --------------- 
//    | Outer3     |-------> |   InterB    |
//    --------------         ---------------
//    | addInt()   |         | ADD(int,int)|
//    |new InterB()|
