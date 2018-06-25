package com.acenture.features.defaultmethod;

public interface Interface2 {

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}