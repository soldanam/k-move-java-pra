
public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7};
		try{
			int c = 10/0; //����0���� ������
			for(int i =0; i<5; i++){
				System.out.println(a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index����");//������ �ȳ��� ���� �޽����� ����.
		}catch(ArithmeticException e) {
			System.out.println("0���� ����");//������ �ȳ��� ���� �޽����� ����.
		}finally {//������ �����Ѵ�.0
			System.out.println("������ ����");
		}
		

	}

}
/*
 //int c���� �������� �ʰ�, �׳� ���� �ϳ��� ��. try-catch�� ������� ��. 
 try{		
			for(int i =0; i<5; i++){
				System.out.println(a[i]);
			}
			int c = 10/0; 
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index����");//������ �ȳ��� ���� �޽����� ����.
		}catch(ArithmeticException e) {
			System.out.println("0���� ����");//������ �ȳ��� ���� �޽����� ����.
		}catch(Exception e){//�̰� �� �ڷ�
			System.out.println("Exception ����")}
		finally {//������ �����Ѵ�.0
			System.out.println("������ ����");
		}
		
 */
