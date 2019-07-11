package school.business.domain;

public class Employee {
	private String name;
	private int age; 
	private String dept;
	
	public Employee() {
		
	}
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age= age;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void printInfo() {
		System.out.println("이름: "+name+"\t나이: "+age+"\t과목: "+dept);
	}

}
