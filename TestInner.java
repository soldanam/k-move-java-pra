class Outer{
	
	//private int size=10; 
	
	/*public Object makeObject() {
		class Inner{//extends Object 
			public String toString() {
				return "�͸� Ŭ����";
			}
		}
		return new Object() {
			public String toString() {
				return "�͸�Ŭ����";
			}
		};
		//return new Inner();//object  Ÿ������ ��������
		
		
	}*/

	/*static class Inner{//����Ŭ����
		private static int size=20; //Ŭ������ static �̴ϱ� ������ static �׸��� Outer.Inner.size�� �� �����
		public void doStuff() {
			size++;//21�̵� ���� ����� ������ ������ ��
			this.size++;//22�� �� 
			//System.out.println(Inner.size);// �ȵ�
			//Outer.this.size++;//11�̵� . outer�� ������ �ִ� size�� ������ ++����
		}
	}*/
}
public class TestInner {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Object obj = outer.makeObject();//Inner�� ������ object �� �ִ� toStrint() overing�ع���
										// object Ÿ�� Outer.Inner ��ü
		System.out.println(obj);*/
		
		//inner.doStuff();
		//System.out.println(Outer.Inner.size);
	}

}
