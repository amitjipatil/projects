class A
{
	public void test(int t)
	{
		System.out.println("int param");
		
	}
	protected void show()
	{
		System.out.println("parent");
	}
	}
public class OverRiding extends A{

	public void test(char x)
	{
		System.out.println("char param");
	}
	@Override
	public void show()
	{
	  System.out.println("child");	
	}
	public static void main(String[] args) {
		A a=new OverRiding();
		a.show();
	OverRiding ov=new OverRiding();
	ov.show();
	ov.test('n');// overloading in different classes
	ov.test(4);//overloading in different classes

	}

}
