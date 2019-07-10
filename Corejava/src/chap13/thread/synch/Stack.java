package chap13.thread.synch;
import java.util.*;

/**doc 주석*/
public class Stack {
	private List<Character> buffer = new ArrayList<Character>(10); // not thread-safe

	public void push(char c) {
		synchronized (buffer) {//synchronized(this)써도 무방
			buffer.add(c);
			buffer.notify();//lockflag 땜에 사용 synchronized 안에서만 사용 가능. notifyall써도 되나 하나씩 올려도 되기 때문에 이렇게 함. 먼저해도 되고 늦게 해도됨 
		}
		
	}
	
	public char pop() {//underflow의 문제는 있지만 overflow의 문제는 해결했다..
		synchronized (buffer) {
			while(buffer.size()==0) {
				try {
					buffer.wait();//lockflag 땜에 사용 synchronized 안에서만 사용 가능.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			char c = buffer.remove(buffer.size() - 1); // index가 범위 밖이면  IndexOutOfBoundsException 발생
			return c;
		}
		
	}
}
