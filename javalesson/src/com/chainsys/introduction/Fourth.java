package com.chainsys.introduction;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		//taskA();
	    taskB();
		//taskC();
		//taskD();
	}
		public static void taskA()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name:");
		String name = sc.next();
		sc.close();
		System.out.println(name);

	}

	public static void taskB() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int firstvalue = sc.nextInt();
		int result = firstvalue * 100;
		System.out.println(result);
		//obj.close();

	}
	public static void taskC(){
		String s1="100";
		String s2="25";
		System.out.println("s1+s2");
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println(z);
		
	}
	public static void taskD() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<0)
		{
			System.out.println("Invalid age!!!");
			
		}
		if(age<18)
		{
			System.out.println("sorry you need to wait to get dl");
			
		}
		else
		{
			System.out.println("Happy biking...");
		}
	}
	

}
