package chap13.thread.synch;
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
			//synchronized (stack) { //여기에 this넣으면 안됨. 
				stack.push(c);//먼저 다른거를 작업을 해서 출력 화면을 보면 push와 pop이 안맞는다.
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
			synchronized (stack) {//주석처리 시
				c = stack.pop();
				System.out.println("Consumer " + num + " pop : " + c);
			}
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//주석처리 시
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
