package multithreading;

public class PrintSequence {

	
	public static void main(String[] args)throws Exception {
		TestThread obj=new TestThread();
		Thread th1= new Thread(obj);
		th1.setName("thread no 1 ");
		th1.start();
	//	Thread.sleep(1000);
	
		Thread th2= new Thread(obj);
		th2.setName("thread no 2 ");
		th2.start();
	//	Thread.sleep(1000);

		
		/*TestThread obj=new TestThread();
		obj.start();
		Thread.sleep(1000);
		TestThread obj2=new TestThread();
		obj2.start();
		Thread.sleep(1000);*/
	}
	
}
class TestThread implements Runnable{
 private int i=1;
	@Override
	public synchronized void run() {
	    while (i <= 10) {
	        try {
	           // notify();
	            System.out.println(Thread.currentThread().getName() + " prints " + i);
	            i++;
	            Thread.sleep(1000);
	            wait(1000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	
}
