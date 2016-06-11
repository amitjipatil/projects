package multithreading;

public class InterThreadTest {

	public static void main(String[] args) {
		Customer c=new Customer();
		CustomerThread ct= new CustomerThread(c);
		ct.start();
		
		new Thread(){  //anonymus inner class
			public void run(){c.deposit(10000);}  
			}.start();  
		
	}
}
