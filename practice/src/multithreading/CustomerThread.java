package multithreading;

public class CustomerThread extends Thread{

	Customer c;
	public CustomerThread(Customer c) {
	    this.c=c;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
      		c.withdraw(15000);
      		
	}

}
