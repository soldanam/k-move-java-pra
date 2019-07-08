class Man extends Thread {
	private ShoppingCart cart;

	public Man(ShoppingCart cart) {
		this.cart = cart;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Product item = new Product("�ﱹ�� "+ i + "��", 17000);
			synchronized (cart) {
				cart.addProduct(item);
				System.out.println("���ڰ� ���� īƮ�� " + item.getName() + "�� ��ҽ��ϴ�.");
			}
			try { 
				Thread.sleep((int)(Math.random() * 300)); 
			} catch (InterruptedException e) { }
		}
	}
}

class Woman extends Thread {
	private ShoppingCart cart;

	public Woman(ShoppingCart cart) {
		this.cart = cart;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			synchronized (cart) {
				Product item = cart.removeProduct();
				System.out.println("���ڰ� ���� īƮ���� " + item.getName() + "�� ���½��ϴ�.");
			}
			try { 
				Thread.sleep((int)(Math.random() * 300)); 
			} catch (InterruptedException e) { }
		}
	}
}

public class ShoppingCartTest {
	public static void main(String[] args) {
		// Man, Woman�� �ϳ��� ���� ShoppingCart�� ������ �۾�
		ShoppingCart cart = new ShoppingCart();

		Thread man = new Man(cart);
		man.start();

		Thread woman = new Woman(cart);
		woman.start();
	}
}
