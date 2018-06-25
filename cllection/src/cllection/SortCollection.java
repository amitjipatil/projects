package cllection;
import java.util.*;
public class SortCollection {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add("sam");
	l.add("raju");
	l.add("amit");
	l.add("guru");
	l.add("amit");
	//l.add(7123); // class cast exception
	Collections.sort(l);//to sort 
	List al=new ArrayList(new LinkedHashSet(l));// to remove duplicate
	System.out.println(l);
	System.out.println(al);
	//System.out.println(null);//error interview question
}
	
	
}
