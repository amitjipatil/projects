package multithreading;

public class MyThreading extends Thread{
	@Override
	public void run() {
	for(int i=0;i<5;i++)
	{
		System.out.println("run()");
		//Thread.yield();
		currentThread();
		/*try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
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
