class MyException extends Exception{
	public String toString() {
		return "MyException";
	}
}
class TestException4 {
	public void makeException()throws Exception{//추가
		int i = 10/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException4 te = new TestException4();//추가
		
		try {
			te.makeException();//추가
			throw new MyException();//객체 생성 한 후 주소 전달
		
		}catch(Exception e ) {
			System.out.println(e);
			e.printStackTrace();//throw가 가지고 있는 .printStackTrace();를 사용 
		}
	}

}
