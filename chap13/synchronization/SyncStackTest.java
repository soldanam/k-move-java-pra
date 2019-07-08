class Producer extends Thread {
	private SyncStack stack;
	private int num;
	private static int counter;

	public Producer(SyncStack stack) {
		this.stack = stack;
		num = ++counter;
	}

	public void run() {
		char c;

		for (int i = 0; i < 10; i++) {
			c = (char) (Math.random() * 26 + 'A');
			//synchronized (stack) { 
				stack.push(c);
				System.out.println("Producer " + num + " push: " + c);
			//}
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	private SyncStack stack;
	private int num;
	private static int counter;

	public Consumer(SyncStack stack) {
		this.stack = stack;
		num = ++counter;
	}

	public void run() {
		char c;

		for (int i = 0; i < 10; i++) {
			//synchronized (stack) {
				c = stack.pop();
				System.out.println("Consumer " + num + " pop : " + c);
			//}
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SyncStackTest {
	public static void main(String[] args) {
		// 각각 2개의 Producer, Consumer가 하나의 공유 stack을 가지고 작업
		SyncStack stack = new SyncStack();

		Thread prod1 = new Producer(stack);
		prod1.start();

		Thread prod2 = new Producer(stack);
		prod2.start();

		Thread cons1 = new Consumer(stack);
		cons1.start();

		Thread cons2 = new Consumer(stack);
		cons2.start();
	}
}
