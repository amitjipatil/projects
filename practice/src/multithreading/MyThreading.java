package multithreading;

public class MyThreading extends Thread{
	@Override
	public  void run() {
	
		test();
	
	
	}
	private static synchronized void test() {
		for(int i=0;i<5;i++)
		{
			System.out.println(currentThread().getName()+" run()");
		}
			
	}
	
	
	void run(int c)
	{
		System.out.println("cccc");
		//Thread.yield();
	}
	/*public void start()
	{
		System.out.println("ggg");
		run();
	}*/

}
