package chap13.thread.problem;

public class ClassEx {//Ŭ������ ���� �˰� �; ���.
	class name2{}//����Ŭ���� ���ΰ� �ִ� Ŭ���������� ��ü ���� ����. 
	
	static class name3{}//static class. ClassEx�� ���� ���������� �����ϰ� ���� ������. 

	public static void main(String[] args) {//3.instance �ϰ��
		// TODO Auto-generated method stub
		Thread t = new Myclass();//2. �����ϸ� ���� 4. ���� �ȳ�
		
		Thread t2 = new Thread(new Runnable() {//��ϸӽ� class ClassEx$1.class��� �����̵ȴ�.
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
			 //��� �ӽ� class(�͸� class)new Myclass()���� ';'������//�ѹ��� ����� �� �մ°� ����. superclass�� insterface ��  �ڱⰡ extends�ϴ� ���� ���� �ٵ� �� �� �־�
		  //��𼭳� �� �� �ִ�. 
		
		};//��ϸӽ� class 
		
		class name{//local class 
			
		}
		
}
	
class Myclass extends Thread{//1. �̰� classEx�ȿ� �ְ�
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

