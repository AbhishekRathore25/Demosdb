package java12;



class myThread extends Thread{
	
	public void run() {
		for (int i=0; i<=10;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadEX {


	public static void main(String[] args) {
		myThread t= new myThread();
		t.start();
		for (int i=0; i<=10;i++) {
			System.out.println(i);
		}
	

	}

}
