public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Thread t = new Counter2();
		t.start();
	}
}

class Counter2 extends Thread {
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
