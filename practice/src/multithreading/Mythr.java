package multithreading;

public class Mythr extends Thread{
	Synchronise s;

	Mythr(Synchronise s)
	{
		this.s=s;
	}
	@Override
public void run() {
		//show();
s.display();

}
	synchronized public void show()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread().getName()+" show method");
		}
	}
}
