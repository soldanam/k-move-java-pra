package chap13.thread.basic;

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Thread t = new MyCounter();
		t.start();
	}
}

class MyCounter extends Thread {
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
