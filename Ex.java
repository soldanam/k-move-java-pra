interface InterA{
	public static final int Final = 10;
	//public abstract void methodA();
	void methodA();
}
public class Ex implements InterA{
	public void methodA() {
		System.out.println("Ex");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex i = new Ex();
		InterA j = new Ex(); //�ٿ뼺
		i.methodA();
		j.methodA();
		System.out.println(InterA.Final);
		System.out.println(i.Final);
		System.out.println(j.Final);

	}

}
