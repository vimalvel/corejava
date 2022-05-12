package com.chainsys.trycatch;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args)
	{
		//m4();
		
	}
	

	public static void m4()
	{
		System.out.println("Before try");
		int X=0,y=0,z=0;
		String s1=null,s2=null;
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			System.out.println("Inside Try");
			System.out.println("Enter value for X");
			s1=sc.nextLine();
			System.out.println("Enter Value for Y");
			s2=sc.nextLine();
			X=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=X/y;
			System.out.println("Result"+z);
			
			
		}
		/*
		 * catch(Exception err)
		 * {
		 * System.out.println("Inside Catch3"+err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
			}
		 */
		catch(ArithmeticException err)
		{
			System.out.println("Inside Catch1"+err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
			
		}
		catch(NumberFormatException err)
		{
			System.out.println("Inside Catch3"+err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
		}
		catch(Exception err) {
			System.out.println("Inside Catch3"+err.getMessage());
			System.out.println("ErrorType"+err.getClass().getName());
			
		}
		finally
		{
			System.out.println("Inside Finally");
			sc.close();
		}
	
		
	}
	
}
