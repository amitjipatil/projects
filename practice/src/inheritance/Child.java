package inheritance;

public class Child extends Parent implements ParentI {
	static{
		System.out.println("child static");
	}

	/*Child()
	{}*/
	Child(int i)
	{
		//super();
		super(4);
		
		System.out.println("child constructr");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		System.out.println("main");
	//	System.out.println(Child.a);
		Child c=new Child(40);

	}

}
