package cloning;

public final class MyClone implements Cloneable {

	int age;
	MyClone(int age)
	{
		this.age=age;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		MyClone obj=new MyClone(20);
		System.out.println("obj.hashCode() "+obj.hashCode());
		System.out.println("obj age="+obj.age);
		
		MyClone clone=(MyClone) obj.clone();
		System.out.println("clone.hashCode()"+clone.hashCode());
		System.out.println("clone age="+clone.age);
		clone.age=44;
		System.out.println("clone age after change="+clone.age);
		System.out.println("obj age after change="+obj.age);// obj age is remains same as it is 20 because of clone

		System.out.println("obj==clone "+(obj==clone));
		String s=new String("ram");
		//String s1=s.clone(); //we cannot clone the string object
		
	}

}
