package java12;





public class RunnableEx implements Runnable{

	
	public void run() {
		for (int i=0; i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		RunnableEx m =new RunnableEx();
		Thread t = new Thread(m);
		t.start();
		for (int i=0; i<=10;i++) {
			System.out.println(i);
		}
	}

}
