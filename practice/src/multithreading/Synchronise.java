package multithreading;

public class Synchronise extends Thread{
	 public void display()
	{
		synchronized(Synchronise.class){
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" display");
		
		}
	}
	}

}
