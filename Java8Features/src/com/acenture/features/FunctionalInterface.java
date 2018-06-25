package com.acenture.features;

import com.acenture.features.Lambda.MathOperation;
import com.acenture.features.defaultmethod.Interface1;
import com.acenture.features.defaultmethod.Interface2;


public class FunctionalInterface {

	
	public static void main(String[] args) {
	
		//FunctionalInterface tester=new FunctionalInterface();

		Interface2 itf2=() -> System.out.println("Hello.. Interface2 "); 
		Interface1 addamit= x -> {
			
			return x + " Amit"; };
			
			Interface1 square= x -> {
				//System.out.println("square "+(x+x));
				return x +" "+ x; };
				
				System.out.println(square.method1("Patil"));
				System.out.println(addamit.method1("Patil"));
				itf2.method2();
				
				//System.out.println("Demo::: " + tester.operate("Patil", square));
				
				
				//Interface1 test;
				//System.out.println(test.method1("Patil") );	
	}

/*	 private String operate(String ss, Interface1 mathOperation) {
	      return mathOperation.method1(ss);
	   }
*/
}
