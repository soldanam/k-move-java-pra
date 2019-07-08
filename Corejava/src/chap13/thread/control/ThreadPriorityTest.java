package chap13.thread.control;

class Runner implements Runnable {
    @Override
	public void run() {
		System.out.println(Thread.currentThread() + " is running");//string 연결 연산자 +할때 한쪽이 string이면 나머지도 string으로 변함
	}
}

public class ThreadPriorityTest {
	public static void main(String[] args) {
		System.out.println("Thread.MIN_PRIORITY : " + Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY);
		System.out.println("Thread.MAX_PRIORITY : " + Thread.MAX_PRIORITY + "\n");

		System.out.println("main thread : " + Thread.currentThread());
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY + 3);
		System.out.println("main thread : " + Thread.currentThread() + "\n");

		Runner r = new Runner();
		Thread t1 = new Thread(r); //우선순위 8
		t1.setName("1st Thread");
		Thread t2 = new Thread(r, "2nd Thread");//code와 data공유 우선순위 8

		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println("t1 is alive? " + t1.isAlive());

		t1.start();
		System.out.println("t1 is alive? " + t1.isAlive());

		t2.start();
	}
}
