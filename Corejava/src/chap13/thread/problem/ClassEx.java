package chap13.thread.problem;

public class ClassEx {//클래스에 대해 알고 싶어서 사용.
	class name2{}//내부클래스 갑싸고 있는 클래스에서만 객체 생성 가능. 
	
	static class name3{}//static class. ClassEx와 동등 독립적으로 존재하고 생성 가능함. 

	public static void main(String[] args) {//3.instance 일경우
		// TODO Auto-generated method stub
		Thread t = new Myclass();//2. 실행하면 오류 4. 오류 안남
		
		Thread t2 = new Thread(new Runnable() {//어나니머스 class ClassEx$1.class라고 저장이된다.
			 @Override
				public void run() {
					int i = 0;

					while (true) {
						System.out.println("count " + i++ + " by " + Thread.currentThread().getName());
						if (i == 50) {
							break;
						}
					}
				}
		  });
			 //어나니 머스 class(익명 class)new Myclass()부터 ';'전까지//한번만 사용할 수 잇는거 있음. superclass나 insterface 등  자기가 extends하는 것을 써줌 바디를 줄 수 있어
		  //어디서나 들어갈 수 있다. 
		
		};//어나니머스 class 
		
		class name{//local class 
			
		}
		
}
	
class Myclass extends Thread{//1. 이걸 classEx안에 넣고
	 @Override
		public void run() {
			int i = 0;

			while (true) {
				System.out.println("count " + i++ + " by " + Thread.currentThread().getName());
				if (i == 50) {
					break;
				}
			}
		}
}

