package cllection;

import java.util.*;

public class MySet {
public static void main(String[] args) {
	Set hs= new HashSet();
	LinkedHashSet lhs=new LinkedHashSet();
	String s="amit";
	String m="amit";
	hs.add("India");
	hs.add("America");
	hs.add("China"); 
	hs.add("Japan");
	hs.add("America");
	hs.add(s);
	hs.add(m);
	
	Iterator it=hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println();
	lhs.add("raje");
	lhs.add("shivaji");
	lhs.add("maharaj");
	Iterator itr=lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
