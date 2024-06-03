package java12;


 class Super{
	 public void display() {
		 System.out.println("Super");
	 }
 }
 class Sub extends Super{
	 
	 
	 public void display() {
		 System.out.println("Sub");
	 }
 }

public class Overreading {

	public static void main(String[] args) {
		Super obj = new Super();
		obj.display();
        
		
		Sub obj1 = new Sub();
				obj1.display();
	}

}
