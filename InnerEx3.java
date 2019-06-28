class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int ilv = outerIv;
		int ilv2 = outerCv;
		
	}
	static class StaticInner{
		static int scv = outerCv;
	}
	void myMethod() {
		int lv = 0; 
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			//int liv3 = lv; 외부클래스의 직역변수는 final이 붙은 변수만 접근 가능
			int liv4 = LV;
		}
	}


}
