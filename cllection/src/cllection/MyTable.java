package cllection;

import java.util.Hashtable;

public class MyTable {
	public static void main(String[] args) {
		Employee ee=new Employee(4,"ww");
		try{
		Hashtable ht= new Hashtable();
		ht.put("a", 1);
		ht.put("b", 2);
		ht.put("c", 3);
		ht.put("a", 88);
		ht.put(ee, 111);
		
		//ht.put(null, null);
		System.out.println(ht);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
