package chap13.thread.synch;
import java.util.*;

/**doc �ּ�*/
public class Stack {
	private List<Character> buffer = new ArrayList<Character>(10); // not thread-safe

	public void push(char c) {
		synchronized (buffer) {//synchronized(this)�ᵵ ����
			buffer.add(c);
			buffer.notify();//lockflag ���� ��� synchronized �ȿ����� ��� ����. notifyall�ᵵ �ǳ� �ϳ��� �÷��� �Ǳ� ������ �̷��� ��. �����ص� �ǰ� �ʰ� �ص��� 
		}
		
	}
	
	public char pop() {//underflow�� ������ ������ overflow�� ������ �ذ��ߴ�..
		synchronized (buffer) {
			while(buffer.size()==0) {
				try {
					buffer.wait();//lockflag ���� ��� synchronized �ȿ����� ��� ����.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			char c = buffer.remove(buffer.size() - 1); // index�� ���� ���̸�  IndexOutOfBoundsException �߻�
			return c;
		}
		
	}
}
