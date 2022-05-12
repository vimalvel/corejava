package com.chainsys.introduction;

public class fifth {
	public static void main(String[] args) {
		printtriangleB();
	}
	public static void printnumbersoneToHundred() {
		int count=0;
		for (count=0;count<=100;count++)
		{
			System.out.println(count +"");
		}
		
	}
	public static void printNumbertentoone() {
		int count=0;
		for(count=-10;count<=1;count--)
		{
			System.out.println(count+"");
			
		}
	}
	//nested for loop
	public static void printMatrix() {
		int countA=0;
		for(countA=1;countA<=10;countA++)
		{
			for(int countB=1;countB<=5;countB++)
			{
				System.out.print(countB+" ");
			}
			System.out.println();
		}
	
		}
	public static void printtriangle() {
		int countA=0;
		for(countA=1;countA<=10;countA++)
		{
			for(int countB=1;countB<countA;countB++)
			{
				System.out.println(countB +"");
			}
			
		}
		System.out.println();
		
	}
      public static void printtriangleB()
	{
		
		int countA=0;
		for(countA=1;countA<=5;countA++)
		{
			for(int countB=1;countB<countA;countB++)
			{
				System.out.print(".");
			}
			for(int countc=countA;countc>=1;countc--)
			{
				System.out.print(countc);
			}
			System.out.println();
		
		}
		
		
	}
     

}
