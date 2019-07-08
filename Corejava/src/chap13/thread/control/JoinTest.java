package chap13.thread.control;

public class JoinTest {
	public static void main(String[] args) {
		Thread t = new Thread(new Count()); // 
		Thread t2 = new Thread(new Count());
		t.start(); // t.join을 했기 때문에 이게 49까지 출력하면 main 실행
		t2.start();

		try {
			t.join(); // t가 수행 종료될 때까지 join()을 호출한 스레드(main thread)는 block됨
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("End of main");
	}
}

class Count implements Runnable {
    @Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " :  i = " + i);
		}
	}
}
