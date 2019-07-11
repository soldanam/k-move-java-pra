package chap06.birthdate;
 public class BirthDateTest {

	 /**
	  * BirthDate 객체를 테스트 해보기 위한 테스트 클래스
	  * @author HANSUNG
	  * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDate birthday = new BirthDate(1997,10,7);//생성자 constructor
		BirthDate yourbirthdate = birthday.addDays(3);
		
		
		birthday.print();
		yourbirthdate.print();
	
	}

}
