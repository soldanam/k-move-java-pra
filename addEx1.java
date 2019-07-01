//interface를 정의하여 처리 - 익명 클래스
interface InterB{
	void add(int a, int b);
}
class Outer3{//버튼
	InterB addInt() {//버튼 눌렀다. 익명클래스 -local 클래스
		return new InterB() {//이벤트
			//버튼 이벤트 하는 일
			public void add(int a, int b) {//Object 사용 못함. object안에 add 함수 없음. 그래서 하나를 정의 해줘야함.
				System.out.println("a와 b의 합: "+(a+b));
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
