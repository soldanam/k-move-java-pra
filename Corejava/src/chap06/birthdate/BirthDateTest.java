package chap06.birthdate;
 public class BirthDateTest {

	 /**
	  * BirthDate ��ü�� �׽�Ʈ �غ��� ���� �׽�Ʈ Ŭ����
	  * @author HANSUNG
	  * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDate birthday = new BirthDate(1997,10,7);//������ constructor
		BirthDate yourbirthdate = birthday.addDays(3);
		
		
		birthday.print();
		yourbirthdate.print();
	
	}

}
