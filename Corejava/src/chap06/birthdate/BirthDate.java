package chap06.birthdate;

public class BirthDate {//private�̳� protected �� ���� �ϳ� �̻��� constructor �־����.
	/**
	 * ��������� ��Ÿ���� ��¥������ ǥ���ϱ� ���� Ŭ���� �Դϴ�.
	 * �� Ŭ������ ��ü�� �ϳ��� ������� ������ �����ϰ� �ֽ��ϴ�.
	 * */
	//attributes
	private int  year = 2000;
	private int month =1;
	private int day = 1;
	
	//constructors class�� ���� Ÿ��
	public BirthDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	public BirthDate(BirthDate birthdate) {
		this.year = birthdate.year;
		this.month = birthdate.month;
		this.day = birthdate.day;
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
	/*public void addDays (int moreDays) {//moreDays��ŭ DAY���� �ø���.
		this.day+=moreDays;
		
	}*/
	
	public BirthDate addDays(int moreDays) {
		//BirthDate birthday = new BirthDate(this);
		//birthday.day +=moreDays;
		//return birthday;
		
		/*this.day +=moreDays;
		return this;*/
		
		return new BirthDate(this.year, this.month, this.day+moreDays);
		
		
	}
	//operations
	public void print() {
		System.out.println("BirthDate: "+year+"-"+month+"-"+day);
	}

}
