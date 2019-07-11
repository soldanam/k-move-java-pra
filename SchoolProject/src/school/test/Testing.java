package school.test;

import school.business.domain.*;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("이지은", 27, 2012);
		Teacher t = new Teacher("홍길동",42,"자바");
		Employee e = new Employee("배주현",29, "학생식당");
		
		s.printInfo();
		t.printInfo();
		e.printInfo();
		

	}

}
