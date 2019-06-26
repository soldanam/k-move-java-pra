class StaticTest {
	static int count = 0; 
	static {count++;}
	{count++;}
	StaticTest(){count++;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest s = new StaticTest();
		s= new StaticTest();
		s.count++;
		StaticTest.count++;
		System.out.println(count);
		
	}

}
