package multithreading;

public class ThreadTest {
	public static void main(String[] args) {
		MyThreading t=new MyThreading();
		t.setPriority(7);
		System.out.println(t.getPriority());
		t.start();	
		for (int i = 0; i <5; i++) {
			System.out.println("amit");
		}
	}
	

}
