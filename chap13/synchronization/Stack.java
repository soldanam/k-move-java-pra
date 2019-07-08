import java.util.*;

public class Stack {
	private List<Character> buffer = new ArrayList<Character>(10); // not thread-safe

	public void push(char c) {
		buffer.add(c);
	}
	
	public char pop() {
		char c = buffer.remove(buffer.size() - 1); // index가 범위 밖이면  IndexOutOfBoundsException 발생
		return c;
	}
}
