package methods;

public class Child extends Parent{
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
		
		Parent parent=new Parent();
		Child child=new Child();
		Parent pc=new Child();
		
		parent.m1();
		
	    child.m2();
	    child.add();
	    
	    pc.m1();
		pc.draw();
		
		
	}

}
