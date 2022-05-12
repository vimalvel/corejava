package com.chainsys.entrypoint;

public class Demo {
	public static int DataA;//static global variable
	public final int DataB; //immutable global variable (not static)
	public final static int DataC=300; //constant
	
	//constructor
	public Demo(int dataB)
	{
		this.DataB=dataB;
	}
	//static method can be called without an object
	public static void sayHello() {
		System.out.println("Hello Deveoper!!!");
	}
	//non static method
	public void greetUser()
	{
		System.out.println("Greetings User!!!");
	}

	
	}

