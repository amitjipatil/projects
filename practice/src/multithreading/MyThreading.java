package multithreading;

public class MyThreading extends Thread{
	
	Display d;
	String name;
	public MyThreading(Display d,String name) {
		this.d=d;
		this.name=name;
	}
	
	@Override
	public  void run() {
	
		try {
			d.test(name);
		} catch (Exception e) {
			
			e.printStackTrace();
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


