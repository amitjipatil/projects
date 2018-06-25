package cllection;

import java.util.*;

public class ArraylistExample {
   public static void main(String args[]) {
 	  ArrayList obj = new ArrayList();

	  obj.add("Amit");
	  obj.add("sam");
	  obj.add("prasad");
	  obj.add("sam");
	  obj.add(2);

	  System.out.println(obj);
           Iterator it=obj.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	 
   }
}