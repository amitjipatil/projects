package com.acenture.features.defaultmethod;

@FunctionalInterface
public interface Interface1 {

	String method1(String str);
	
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
	static void add()
	{
		System.out.println("addn ..");
	}
}
