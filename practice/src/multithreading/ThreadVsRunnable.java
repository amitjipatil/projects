package multithreading;

class ImplementsRunnable implements Runnable {
	 
	
/*	Thread is a block of code which can execute concurrently with other threads in the JVM. You can create and run a thread in either ways; Extending Thread class, Implementing Runnable interface.

	Both approaches do the same job but there have been some differences. Almost everyone have this question in their minds: which one is best to use? We will see the answer at the end of this post.

	The most common difference is

	*** When you extends Thread class, after that you can’t extend any other class which you required. (As you know, Java does not allow inheriting more than one class).
	When you implements Runnable, you can save a space for your class to extend any other class in future or now.
	However, the significant difference is.

	*** When you extends Thread class, each of your thread creates unique object and associate with it.
	When you implements Runnable, it shares the same object to multiple threads.
	
	*/
	 private int counter = 0;
	 
	 public void run() {
	 counter++;
	 System.out.println("ImplementsRunnable : Counter : " + counter);
	 }
	 }
	 
	 class ExtendsThread extends Thread {
	 
	 private int counter = 0;
	 
	 public void run() {
	 counter++;
	 System.out.println("ExtendsThread : Counter : " + counter);
	 }
	 }
	 
	 public class ThreadVsRunnable {
	 
	 public static void main(String args[]) throws Exception {
	 //Multiple threads share the same object.
	 ImplementsRunnable rc = new ImplementsRunnable();
	 Thread t1 = new Thread(rc);
	 t1.start();
	 Thread.sleep(1000); // Waiting for 1 second before starting next thread
	 Thread t2 = new Thread(rc);
	 t2.start();
	 Thread.sleep(1000); // Waiting for 1 second before starting next thread
	 Thread t3 = new Thread(rc);
	 t3.start();
	 
	 //Creating new instance for every thread access.
	 ExtendsThread tc1 = new ExtendsThread();
	 tc1.start();
	 Thread.sleep(1000); // Waiting for 1 second before starting next thread
	 ExtendsThread tc2 = new ExtendsThread();
	 tc2.start();
	 Thread.sleep(1000); // Waiting for 1 second before starting next thread
	 ExtendsThread tc3 = new ExtendsThread();
	 tc3.start();
	 }
	 }
	 
	 
 /*  ImplementsRunnable : Counter : 1
	 ImplementsRunnable : Counter : 2
	 ImplementsRunnable : Counter : 3
	 ExtendsThread : Counter : 1
	 ExtendsThread : Counter : 1
	 ExtendsThread : Counter : 1*/