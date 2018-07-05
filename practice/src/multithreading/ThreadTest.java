package multithreading;


/* 1.Synchronization in java guarantees that no two threads can execute a synchronized method which requires same lock simultaneously or concurrently.
2.synchronized keyword can be used only with methods and code blocks. These methods or blocks can be static or non-static both.
3.When ever a thread enters into java synchronized method or block it acquires a lock and whenever it leaves java synchronized method or block it releases the lock. Lock is released even if thread leaves synchronized method after completion or due to any Error or Exception.
4.java synchronized keyword is re-entrant in nature it means if a java synchronized method calls another synchronized method which requires same lock then current thread which is holding lock can enter into that method without acquiring lock.
5.Java Synchronization will throw NullPointerException if object used in java synchronized block is null. For example, in above code sample if lock is initialized as null, the synchronized (lock) will throw NullPointerException.
6.Synchronized methods in Java put a performance cost on your application. So use synchronization when it is absolutely required. Also, consider using synchronized code blocks for synchronizing only critical section of your code.
7.It’s possible that both static synchronized and non static synchronized method can run simultaneously or concurrently because they lock on different object.
8.According to the Java language specification you can not use java synchronized keyword with constructor it’s illegal and result in compilation error.
9.Do not synchronize on non final field on synchronized block in Java. because reference of non final field may change any time and then different thread might synchronizing on different objects i.e. no synchronization at all. Best is to use String class, which is already immutable and declared final.
*/
public class ThreadTest {
	public static void main(String[] args) {
		MyThreading t=new MyThreading();
		t.setName("Pune");
	//	System.out.println(currentThread());
		t.start();	
		
		System.out.println("statement written after t.start()");// all the statements of main() will execute before t.start();
		
		MyThreading thread=new MyThreading();
		thread.setName("mumbai");
		//System.out.println(t.getPriority());
		thread.start();	
		System.out.println("statement written after thread.start()");// all the statements of main() will execute before t.start();
		
		
		/*for (int i = 0; i <5; i++) {
			System.out.println("amit");
			
		}*/
	}
	

}
