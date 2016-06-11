package cloning;

public final class MyClone implements Cloneable {
//{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		MyClone cl=new MyClone();
		System.out.println(cl.hashCode());
		//System.out.println(cl.hashCode());
		MyClone cl1=(MyClone) cl.clone();
		System.out.println(cl1.hashCode());

		String s=new String("ram");
		//String s1=s.clone(); //we cannot clone the string object
		
	}

}
