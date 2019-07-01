class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7};
		try{
			for(int i =0; i<5; i++){
				System.out.println(a[i]);
			}
		}catch(Exception e) {
			System.out.println("에러");//오류가 안나고 오류 메시지가 나옴.
		}
		

	}

}
