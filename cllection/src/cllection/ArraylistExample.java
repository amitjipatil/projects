package cllection;

import java.util.*;

public class ArraylistExample {
   public static void main(String args[]) {
 	  ArrayList al = new ArrayList();
 	 

	  al.add("Amit");
	  al.add("sam");
	  al.add("prasad");
	  al.add("sam");
	  al.add(2);

	  ArrayList newal = new ArrayList();
	  newal=al;// if i assign existing arraylist to new arraylist and add values in new arraylist the it will automatically add these values in old arraylist
	    
	  newal.add("zzzz");
	  newal.add("yyyy");
	  
	  System.out.println("Arraylist= "+al);
	  System.out.println("new Arraylist= "+newal);
	 
   }
}