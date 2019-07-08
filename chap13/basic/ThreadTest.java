public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Counter c = new Counter();
		Thread t = new Thread(c);
		Thread t2 = new Thread(c);
		t.start();
		t2.start();
	}
}

class Counter implements Runnable {
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
