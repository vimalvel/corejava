package com.chainsys.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		String obj=  "0123456789";
		Pattern p= Pattern.compile(obj);
		Matcher m=p.matcher(obj);
		while (m.find()) {
			
		}
		
	}

}
