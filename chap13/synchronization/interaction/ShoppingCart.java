import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	private List<Product> cart = new ArrayList<Product>();
	
	public synchronized void addProduct(Product item) {
		cart.add(item);
		this.notify();
	}
	
	public synchronized Product removeProduct() {
		while (cart.size() == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		return cart.remove(cart.size() - 1);
	}
	
	public synchronized void printCart() {
		System.out.println("== 쇼핑 카트 상품 리스트 ==");
		Iterator<Product> items = cart.iterator();
		while (items.hasNext()) {
			Product item = items.next();
			System.out.println(item.getDescription());
		}
	}
}
