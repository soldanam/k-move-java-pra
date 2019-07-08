package chap13.thread.control;

public class JoinTest {
	public static void main(String[] args) {
		Thread t = new Thread(new Count()); // 
		Thread t2 = new Thread(new Count());
		t.start(); // t.join�� �߱� ������ �̰� 49���� ����ϸ� main ����
		t2.start();

		try {
			t.join(); // t�� ���� ����� ������ join()�� ȣ���� ������(main thread)�� block��
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
