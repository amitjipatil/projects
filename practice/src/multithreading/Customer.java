package multithreading;

public class Customer {
	int amount=10000;
public synchronized void withdraw(int amount)
{
	if (this.amount<amount) {
		System.out.println("less balance..waiting for deposit");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	this.amount-=amount;
	System.out.println("withdraw completed");
}
public synchronized void deposit(int amount)
{
	System.out.println("amount crediting");
	this.amount+=amount;
	System.out.println("10000 amount credited");

	notify();
	}
}
