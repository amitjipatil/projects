package constructorPack;

public class Test {
	static int a = 0;
	 protected Test() {
		//this();
		a++;
		System.out.println(a);
	}

	public Test(int m) {
		a++;
		System.out.println(a);
	}

	void m1() {
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test test = new Test();
		Test test2 = new Test(11);
 
	}

}
