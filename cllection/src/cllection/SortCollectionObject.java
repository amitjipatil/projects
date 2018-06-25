package cllection;
import java.util.*;
public class SortCollectionObject {
	public static void main(String[] args) {
		 Emp ee1=new Emp(5555,"zade");
	       Emp ee2=new Emp(444,"zade");
	       Emp ee3=new Emp(999,"amit");
	       
	       ArrayList al=new ArrayList();
	       al.add(ee1);
	       al.add(ee3);
	       al.add(ee2);
	       
	       Collections.sort(al);// class cast exception Emp must be comparable
	       System.out.println(al);
	       
	       }

}
