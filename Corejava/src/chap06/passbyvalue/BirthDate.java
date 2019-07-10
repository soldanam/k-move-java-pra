package chap06.passbyvalue;

public class BirthDate {//private�̳� protected �� ���� �ϳ� �̻��� constructor �־����.
	//attributes
	private int  year = 2000;
	private int month =1;
	private int day = 1;
	
	//constructors class�� ���� Ÿ�� this�� �ν�Ʈ��Ʈ �޼ҵ� �������� ����.
	public BirthDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	//access & mutarator
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month= month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	//operations
	public void print() {
		System.out.println("BirthDate: "+year+"-"+month+"-"+day);
	}

}
