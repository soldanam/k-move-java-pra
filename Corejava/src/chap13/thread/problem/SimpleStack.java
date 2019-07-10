package chap13.thread.problem;

public class SimpleStack {
	private char[] buffer = new char[5];
	private int index = 0;

	public synchronized void push(char c) {
		buffer[index] = c;
		index++;//if 6을 넘어간 상태에서 push를 한다면 overflow 발생
	}
	
	public char pop() {
		synchronized(this) {
			index--;
			return buffer[index];
			
		}
		
	}
}
