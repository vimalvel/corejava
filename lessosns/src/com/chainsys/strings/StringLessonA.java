package com.chainsys.strings;

public class StringLessonA {
	public static void lessonOne()
	{
		// String is an array of characters
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataOne[]={'c','h','a','i','n'};
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[] {'c','h','a','i','n'});
		System.out.println(thirdString); 
	
	}
	public static void lessonTwo()
	{
		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = "Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;
		System.out.println(firstString);
		System.out.println(secondString);
		firstString = "Welcome";
		System.out.println(firstString);
		System.out.println(secondString);
	}
	public static void creatingStringInaForLoop()
	{
		for(int count=0;count<10;count++)
		{
			String s1="Hello";
		}
	}
		public static void  stringTocharArray() {
			java.util.Scanner scanner=new java.util.Scanner(System.in);
			System.out.println("Enter a Word");
			String firstString=scanner.nextLine();
			scanner.close();
			int stringlength=firstString.length();
			System.out.println("Length"+stringlength);
			char[] data=firstString.toCharArray();
			int dataarraylength=data.length;
			System.out.println("Length"+dataarraylength);
		}
		public static void stringToupperower()
		{
			java.util.Scanner scanner=new java.util.Scanner(System.in);
			System.out.println("Enter a Word");
			String firstString=scanner.nextLine();
			scanner.close();
			System.out.println(firstString);
			String stringInUpperCase=firstString.toUpperCase();
			System.out.println("toUpperCase="+stringInUpperCase);
			// String in firstString is not modified, because String are immutable
			System.out.println("s1="+firstString);
			String stringInLowerCase=firstString.toLowerCase();
			System.out.println("toLowerCase="+stringInLowerCase);
			System.out.println("s1="+firstString);
			//substring
			//from the 4th char till end
			String substring=firstString.substring(3);
			System.out.println(substring);
			// from 3rd car to 6th char (i.e excluding 7th char)	
			// from index 2 to index 5
			substring=firstString.substring(2,6);
			System.out.println(substring);
			//replace
			String replacedstring=firstString.replace('a', 'e');
			System.out.println(replacedstring);
			// equals
			boolean flag1=firstString.equals(stringInUpperCase);// false
			System.out.println(flag1);
			// equalsIgnoreCase
			boolean flag=firstString.equalsIgnoreCase(stringInUpperCase);//true
			System.out.println(flag);
		}
		
		
	

	public static void testStringtrim()
	{
		String secondString=" Hope			it		rain		";
		System.out.println("Before trim "+secondString.length());
		secondString=secondString.trim();
		System.out.println("before trim"+secondString.length());
		
	}
	
	public static void testSplit() {
        String firstString = "Tom and Jerry are good friends";
        String trimedString =firstString.trim();
        String[] data = trimedString.split(" " );
        int count = data.length;
        System.out.println("Word Count"+count);
        for (int index =0;index <count;index++) {
                System.out.println(data[index]);
        }
}
	

public static void testSplitDays() {
        String firstString = " MON;TUE;WED;THU;FRI;SAT;SUN ";
        String trimedString =firstString.trim();
        String[] data = trimedString.split(";" );
        int count = data.length;
        System.out.println("Word Count"+count);
        for (int index =0;index <count;index++) {
                System.out.println(data[index]);
        }
}
 public static void verifyString(String s1)//verify and print
 {
	if(null==s1)
	{
		System.out.println("String is Null");
		return;
	}
	else
		System.out.println("String is Not null"+s1);
	if(!s1.isEmpty())
	
		System.out.println("\t Not empty"+s1);
	else
		System.out.println("\t String is empty");
		
	}
 }
	
