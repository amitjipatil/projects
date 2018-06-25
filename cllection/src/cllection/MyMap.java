package cllection;
import java.util.*;
public class MyMap {

	public static void main(String[] args) {
	
		HashMap hs=new HashMap();
		Employee ee=new Employee(11,"hh");
	hs.put("amit","raj");
	hs.put("patil",101);
	hs.put(ee,111);
	hs.put(null, null);
	hs.put(null, "aa");
	
	hs.put("amit", "ppp");
	System.out.println(hs);
	System.out.println(hs.get(ee));
	System.out.println(hs.get("patil"));
	
	
	 
	
	}

}
