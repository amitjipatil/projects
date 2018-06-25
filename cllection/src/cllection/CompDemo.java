package cllection;

import java.util.TreeSet;

public class CompDemo {

	public static void main(String[] args) {
       Employee e1=new Employee(450,"cc");
       Employee e2=new Employee(100,"aa");
       Employee e3=new Employee(400,"zz");
       Employee e4=new Employee(400,"dd");
       Employee e5=new Employee(150,"ff");
       TreeSet<Employee> t=new TreeSet<Employee>();
       t.add(e1);
       t.add(e2);
       t.add(e3);
       t.add(e4);
       t.add(e5);
       System.out.println(t);
       Employee ee1=new Employee(5555,"zade");
       Employee ee2=new Employee(444,"amit");
       Employee ee3=new Employee(999,"zade");
       
       TreeSet<Employee> t2=new TreeSet<Employee>( new MyComparator ());
       t2.add(ee1);
       t2.add(ee2);
       t2.add(ee3);
       System.out.println(t2);
       
	}

}
