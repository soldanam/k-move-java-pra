package chap13.thread.basic;
public class ThreadTest {//public classs는 하나만 올 수 있다.
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Counter c = new Counter();
		Thread t = new Thread(c);
		Thread t2 = new Thread(c);
		t.start();
		t2.start();
		System.out.println("End of main()");
	}
}

class Counter implements Runnable {
    @Override
	public void run() {
		int i = 0;

		while (true) {
			System.out.println("count " + i++ + " by " + Thread.currentThread().getName());
			if (i == 50) {//50이 넘게 되면 게속 출력한다. 같이 사용한다고 해서 주고받고 하는 것이 아니다.
				break;
			}
		}
	}
}
