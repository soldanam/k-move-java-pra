import java.util.*;

public class SyncStack {
	private List<Character> buffer = new ArrayList<Character>(10);

	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
	}

	public synchronized char pop() {
		// stack�� ��������� lock flag�� ���� ��ٸ�
		while (buffer.size() == 0) {
			try {
				// �����尡 interrupt �Ǹ� wait ���°� ������ exception�� �߻��ϴµ� 
				// �� ��� stack�� ������ ������� �� �����Ƿ� �ٽ� wait ���°� �Ǿ�߸� �� (while ���� ����� ����)
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		char c = buffer.remove(buffer.size() - 1);
		return c;
	}
}
