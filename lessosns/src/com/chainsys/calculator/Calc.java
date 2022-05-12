package com.chainsys.calculator;

public class Calc implements Calculator
{
	public  int add(int n,int m)
	{
		int a=n+m;
		return a;
	}
	public  int multiply(int n,int m)
	{
		int a=n*m;
		return a;
	}
	public int divide(int n,int m)
	{
		int a=n/m;
		return a;
	}
}








