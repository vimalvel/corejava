package com.chainsys.unittester;
import com.chainsys.variables.Calculator;
public class Calculatortest {
	public static void testAdd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Add(arg1,arg2);
		System.out.println("reuslt of addd is :"+output);
		
	}
	public static void testMultiply()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Multiply(arg1,arg2);
		System.out.println("resul of multipl is:"+output);
	}
	public static void testdivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Divide(arg1,arg2);
		
	}
	public static void testsubtract()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Subtraction(arg1,arg2);
		System.out.println("result of subract:"+output);
	}
	public static void testmodules()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.Modules(arg1,arg2);
		System.out.println("Result of module is"+ output);
		
	}
	
 
}
