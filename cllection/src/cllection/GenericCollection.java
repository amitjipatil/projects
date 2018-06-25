package cllection;
import java.util.*;
public class GenericCollection {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		//al.add("raja");
		//al.add("sam");
		Integer intg=new Integer(143);
		System.out.println(intg.hashCode());
		al.add(new Integer(123));
		al.add(1234);
		for(Integer i:al)
		System.out.println("hashcode"+i);
		
	}

}
