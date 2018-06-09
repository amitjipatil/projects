package multithreading;

public class Synchronise extends Thread{
	 public synchronized void display()
	{
		//synchronized(Synchronise.class){
		 int i;
		for ( i= 0; i < 5; i++) {
			
			if (i==3) {
				System.out.println("apply wait");
				/*try {
					wait(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName()+" display");
		
		}
	//}
	}

}
