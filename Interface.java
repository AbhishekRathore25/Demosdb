package java12;


interface A{
	void show();
	void config();

}
class B implements A{
	public void show()
	{
		System.out.println("hello");
	}
	public void config()
	{
		System.out.println("World");
	}
}

public class Interface {

	public static void main(String[] args) {
		A obj = new B();
		obj.show();
		obj.config();

	}

}
