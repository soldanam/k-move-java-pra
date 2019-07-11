package chap06.birthdate;

public class BirthDate {//private이나 protected 못 붙임 하나 이상의 constructor 있어야함.
	/**
	 * 생년원일을 나타내는 날짜정보를 표현하기 위한 클래스 입니다.
	 * 이 클래스의 객체는 하나의 생년월일 정보를 포함하고 있습니다.
	 * */
	//attributes
	private int  year = 2000;
	private int month =1;
	private int day = 1;
	
	//constructors class랑 같은 타입
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
	/*public void addDays (int moreDays) {//moreDays만큼 DAY값을 늘린다.
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
