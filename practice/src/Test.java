import java.util.Iterator;
import java.util.TreeSet;

import equalsmethod.employee;


public class Test  implements Comparable{
	int id;
	String name;
	int salary;
	
	public Test(int id,String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +"**"+name +"**"+salary;
	}
	
	
	public static void main(String[] args) {
	
		
		Test t1=new Test(1, "sss", 555);
		Test t2=new Test(2,"raj",55555);
		Test t3=new Test(3,"sasas",555);
     
		
		TreeSet<Test> t= new TreeSet<Test>();
      t.add(t1);
      t.add(t2);
      t.add(t3);
      System.out.println(t);
      /*Iterator itr=t.iterator();
    		  while(itr.hasNext())
    		  {
    			 Employee e=(Employee) itr.next();
    			 System.out.println(e);
    		  }
*/    			  }

	@Override
	public int compareTo(Object o) {
		return 0;
	}

}
