package school.test;

import school.business.domain.*;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("������", 27, 2012);
		Teacher t = new Teacher("ȫ�浿",42,"�ڹ�");
		Employee e = new Employee("������",29, "�л��Ĵ�");
		
		s.printInfo();
		t.printInfo();
		e.printInfo();
		

	}

}
