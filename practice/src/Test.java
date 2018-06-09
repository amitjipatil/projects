import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

import equalsmethod.employee;


//public class Test  implements Comparable{
	public class Test {

	int id;
	String name;
	int salary;
	
	public Test(int id,String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return id +"--"+name +"--"+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof Test))
			return false;
		Test t=(Test)obj;
		return this.id==t.id && this.name.equalsIgnoreCase(t.name);
		
	}
	@Override
	public int hashCode() {
		//return super.hashCode();
		return Objects.hash(id, name);
	}
	
	
	
	
	public static void main(String[] args) {
	
		
		Test t1=new Test(1, "sss", 555);
		Test t2=new Test(2,"raj",54575);
		Test t3=new Test(3,"sasas",431);
		Test t4=new Test(1, "sss", 555);
		String s1 = new String("pune");
		String s2 = new String("pune");
		System.out.println("s1 hashcode= "+s1.hashCode());
		System.out.println("s2 hashcode= "+s2.hashCode());
		System.out.println("is s1 equals s4?  "+s1.equals(s2));

		System.out.println("t1 hashcode= "+t1.hashCode());
		System.out.println("t4 hashcode= "+t4.hashCode());
		System.out.println("is t1 equals t4?  "+t1.equals(t4));
		
		
     
		
		HashSet t= new HashSet();
     System.out.println(t.add(t2));
     System.out.println(t.add(t1)); 
     System.out.println(t.add(t3)); 
     System.out.println(t.add(t4)); 
 

      t.add("Amit");
      t.add("testy");
      t.add("Amit");
      
      
      System.out.println(t);
      /*Iterator itr=t.iterator();
    		  while(itr.hasNext())
    		  {
    			 Employee e=(Employee) itr.next();
    			 System.out.println(e);
    		  }
*/    			  }

	/*@Override
	public int compareTo(Object o) {
		Test tt=(Test)o;
		if(this.id>tt.id)
		{
			return 5;
		}
		else if(this.id<tt.id)
		{
			return -5;
		}
		return 0;
	}*/

}
