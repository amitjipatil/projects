package mypack;

public class StackOverflow {

	StackOverflow() {

		m1();

	}

	StackOverflow(int i) {
		

	}

	public void m1() {
		new StackOverflow();
	}

	public static void main(String[] args) {

		new StackOverflow();

		/*
		 * int a[]=new int [5]; a[19]=499; System.out.println(a[13]);
		 */

	}

}
