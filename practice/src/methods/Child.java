package methods;

public class Child extends Overriding{
	@Override
	final void add()
	{
		System.out.println("add() child class");
	}
	
	static void draw()
	 {
		 System.out.println("draw() child static");
	 }
	
	void m2()
	{
		System.out.println("m2() child");
	}
	public static void main(String[] args) {
		/*Overriding ch=new Overriding();
		ch.add();*/
		//Overriding.add();
		
		Overriding o=new Overriding();
		Child c=new Child();
		Overriding oo=new Child();
		oo.m1();
		
	    c.m2();
	    oo.add();
		
		oo.draw();
		//oo.draw();
		
	}

}
