package mypackage;

interface First{
	default void show() {
		System.out.println("Defaut First");
	}
}
interface Second {
	default void show() {
		System.out.println("Default second");
	}
	
}

public class TestClass implements First,Second {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		First.super.show();
		Second.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass obj = new TestClass();
		obj.show();

	}

}
