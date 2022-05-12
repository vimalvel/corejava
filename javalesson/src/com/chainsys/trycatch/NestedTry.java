package com.chainsys.trycatch;

import java.util.Scanner;

public class NestedTry {
	static String[] data;
	public static void main(String args[])
	{
		int num=0;
		int numvalue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter Value for X");
				data[0]=sc.nextLine();//123---abcd----123
				numvalue=Integer.parseInt(data[0]);
				System.out.println("The square is"+numvalue*numvalue);
			}
			catch(NumberFormatException nb)
			{
				System.out.println("Not a Number1!:");
				
			}
			num=data.length;
			System.out.println("Array Length"+num);
		}catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println("ArrayINdexOutofBound-No arguments given!!!");
		}
		catch(Exception er) {
			System.out.println("Exception"+er.getMessage());
		}
	}

}
