
public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7};
		try{
			int c = 10/0; //오류0으로 나눠서
			for(int i =0; i<5; i++){
				System.out.println(a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index에러");//오류가 안나고 오류 메시지가 나옴.
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눔");//오류가 안나고 오류 메시지가 나옴.
		}finally {//무조건 실행한다.0
			System.out.println("무조건 실행");
		}
		

	}

}
/*
 //int c까지 내려가지 않고, 그냥 오류 하나만 뜸. try-catch는 순서대로 함. 
 try{		
			for(int i =0; i<5; i++){
				System.out.println(a[i]);
			}
			int c = 10/0; 
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index에러");//오류가 안나고 오류 메시지가 나옴.
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눔");//오류가 안나고 오류 메시지가 나옴.
		}catch(Exception e){//이걸 맨 뒤로
			System.out.println("Exception 조상")}
		finally {//무조건 실행한다.0
			System.out.println("무조건 실행");
		}
		
 */
