package com.chainsys.entrypoint;


public class VariableTester {
	//test static variable
	
	public static void testGlobalVariable()
	{
		//display the value of static field
		//value is zero (default value)
		//DataA is accessed without creating an object
		System.out.println("DataA: " + Demo.DataA);
		//display the value of immutable field
		//this is not possible  without an object
		//System.out.println("DataB: " + Startup.DataB);
		//display the value of constant field
		
		System.out.println("DataC: " + Demo.DataC);
		//modifying value of the static field DataA
		Demo.DataA=2345;
		System.out.println("DataA: " + Demo.DataA);
		//modifying value of the static field DataC
		//ERROR: The final field Startup.DatC cannot be assigned
 		//Startup.DataC=2345;
	}
}






	



	
