class Man extends Thread {
	private ShoppingCart cart;

	public Man(ShoppingCart cart) {
		this.cart = cart;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			Product item = new Product("삼국지 "+ i + "권", 17000);
			synchronized (cart) {
				cart.addProduct(item);
				System.out.println("남자가 쇼핑 카트에 " + item.getName() + "을 담았습니다.");
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
				System.out.println("여자가 쇼핑 카트에서 " + item.getName() + "을 꺼냈습니다.");
			}
			try { 
				Thread.sleep((int)(Math.random() * 300)); 
			} catch (InterruptedException e) { }
		}
	}
}

public class ShoppingCartTest {
	public static void main(String[] args) {
		// Man, Woman이 하나의 공유 ShoppingCart을 가지고 작업
		ShoppingCart cart = new ShoppingCart();

		Thread man = new Man(cart);
		man.start();

		Thread woman = new Woman(cart);
		woman.start();
	}
}
