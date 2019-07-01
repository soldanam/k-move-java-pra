class Outer{
	
	//private int size=10; 
	
	/*public Object makeObject() {
		class Inner{//extends Object 
			public String toString() {
				return "익명 클래스";
			}
		}
		return new Object() {
			public String toString() {
				return "익명클래스";
			}
		};
		//return new Inner();//object  타입으로 돌려버림
		
		
	}*/

	/*static class Inner{//내부클래스
		private static int size=20; //클래스가 static 이니까 변수도 static 그리고 Outer.Inner.size로 값 줘야함
		public void doStuff() {
			size++;//21이됨 제일 가까운 변수를 가지고 함
			this.size++;//22가 됨 
			//System.out.println(Inner.size);// 안됨
			//Outer.this.size++;//11이됨 . outer이 가지고 있는 size를 가지고 ++해줌
		}
	}*/
}
public class TestInner {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Object obj = outer.makeObject();//Inner로 들어가버림 object 에 있는 toStrint() overing해버림
										// object 타입 Outer.Inner 객체
		System.out.println(obj);*/
		
		//inner.doStuff();
		//System.out.println(Outer.Inner.size);
	}

}
