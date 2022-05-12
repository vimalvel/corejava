package com.chainsys.unittester;

import com.chainsys.calculator.Calc;
import com.chainsys.calculator.Calculator;

public class CalcTest {
	public static void main(String[] args) 
	{
		Calculator obj=new Calc();
		System.out.println("Addition  is "+ obj.add(2, 2));
		System.out.println("Division  is "+ obj.divide(6,2));
		System.out.println("Multiplication  is "+ obj.multiply(4, 3));
	}
	

}
