package chap06.basic.dog;

public class Dog {
	
		//attributes
		public String bread;
		public String name;
		public int weight;
		
		//operations
		public void bark(){
			System.out.println("멍멍");
		}
		public void displayInformation() {
			System.out.println("====강아지 정보=====");
			System.out.println("강아지 이름: "+name+"\n강아지 품종: "+bread+"\n강아지 몸무게: "+weight);
		
		}
		
		
	
}
