import java.util.*;

public class SyncStack {
	private List<Character> buffer = new ArrayList<Character>(10);

	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
	}

	public synchronized char pop() {
		// stack이 비어있으면 lock flag를 놓고 기다림
		while (buffer.size() == 0) {
			try {
				// 스레드가 interrupt 되면 wait 상태가 끝나고 exception이 발생하는데 
				// 이 경우 stack이 여전히 비어있을 수 있으므로 다시 wait 상태가 되어야만 함 (while 문을 사용한 이유)
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		char c = buffer.remove(buffer.size() - 1);
		return c;
	}
}
