package chap13.thread.problem;

public class SimpleStack {
	private char[] buffer = new char[5];
	private int index = 0;

	public synchronized void push(char c) {
		buffer[index] = c;
		index++;//if 6�� �Ѿ ���¿��� push�� �Ѵٸ� overflow �߻�
	}
	
	public char pop() {
		synchronized(this) {
			index--;
			return buffer[index];
			
		}
		
	}
}
