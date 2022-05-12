package com.chainsys.datalessons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class WorkingWithDate {
	public static void displaycurrentDate() {
		Calendar obj=Calendar.getInstance();
		Date obj1=obj.getTime();
		System.out.println(obj1);
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
		System.out.println(dateFormat.format(obj1));
		
	}
	public static void displayDob()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your DOB:(YYYY-MM-DD)");
		String dobstring=sc.nextLine();
		sc.close();
		int year=Integer.parseInt( dobstring.substring(0,4));
		int month=Integer.parseInt( dobstring.substring(5,7))-1;
		int day=Integer.parseInt( dobstring.substring(8,10));
		System.out.println(year+"-"+month+"-"+day);
	
	Calendar date = new GregorianCalendar(year,month,day);
	Date dob1=date.getTime();
	SimpleDateFormat f1=new SimpleDateFormat("YYYY-MMM-DD");
	System.out.println("DOB"+f1.format(dob1));
	// Retirement date
	date.add(Calendar.YEAR, 60);
	date.add(Calendar.MONTH, 1);
	date.set(Calendar.DAY_OF_MONTH, 1);
	date.add(Calendar.DATE,-1);
	System.out.println("DOB"+f1.format(date.getTime()));
	
	}

}

