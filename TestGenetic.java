class Box{
	private Object obj; 
	public void setObject(Object obj) {
		this.obj = obj;
	}
	public Object getObject() {
		return obj;
	}
}
class Apple {}

public class TestGenetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box= new Box();
		box.setObject("�赿ȣ");
		String naem = (String)box.getObject();
		box.setObject(new Apple());
		Apple  apple = (Apple)box.getObject();
	}

}
