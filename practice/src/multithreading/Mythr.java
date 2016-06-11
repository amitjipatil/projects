package multithreading;

public class Mythr extends Thread{
	Synchronise s;
	Mythr(Synchronise s)
	{
		this.s=s;
	}
	@Override
public void run() {
	//	show();
s.display();
}
	synchronized public void show()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
