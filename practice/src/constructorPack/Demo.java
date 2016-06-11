package constructorPack;

public final class Demo {

	public final int A;
	Demo(int A)
	{
		this.A=A;
		System.out.println(A);
	}
	void display()
	{
		final int ww=10;
	}

	public static void main(String[] args) {
		Demo d=new Demo(5);
		//d.A=10;
	}
}
