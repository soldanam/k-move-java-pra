class Product{
	static int count = 0; 
	int serialNo;
	{
		++count;
		serialNo = count;
		
		
		
		
	}
}
class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� "+p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ(serial no)�� "+p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ(serial no)�� "+p3.serialNo);
		System.out.println(p1.count);
		System.out.println("����� ��ǰ�� ���� ��� "+Product.count+"�� �Դϴ�");
		
	}

}
