class MyException extends Exception{
	public String toString() {
		return "MyException";
	}
}
class TestException4 {
	public void makeException()throws Exception{//�߰�
		int i = 10/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException4 te = new TestException4();//�߰�
		
		try {
			te.makeException();//�߰�
			throw new MyException();//��ü ���� �� �� �ּ� ����
		
		}catch(Exception e ) {
			System.out.println(e);
			e.printStackTrace();//throw�� ������ �ִ� .printStackTrace();�� ��� 
		}
	}

}
