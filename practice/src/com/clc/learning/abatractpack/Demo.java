package com.clc.learning.abatractpack;

import com.clc.learning.interfacepack.IRun;

public class Demo implements IRun
{

	@Override
	public void walk() {
		
		System.out.println("walk method of Demo class");
	}

	@Override
	public void run() {
		System.out.println("run method of Demo class");
		System.out.println(r);
		
	}

}
