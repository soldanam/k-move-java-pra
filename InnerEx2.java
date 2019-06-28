class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	InstanceInner iv = new InstanceInner();
	static StaticInner cv  = new StaticInner();
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner(); 직접 접근 불가
		StaticInner obj2 = new StaticInner();
		
		InnerEx2  outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
		
		
	}
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//LocalInner lv = new LocalInner(); 매서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 불가
	}
	void myMehod() {
		class LocalInner{}
		LocalInner lv  = new LocalInner();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
