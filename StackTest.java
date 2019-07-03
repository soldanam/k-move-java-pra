import java.util.*;
class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		for(int i=0; i<10 ; i++) {
			s.push(new Integer(i));
		}
		System.out.println("1 pop "+s.pop());
		System.out.println("2 pop "+s.pop());
		System.out.println("stack top : "+s.peek());

	}

}
