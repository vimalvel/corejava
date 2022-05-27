package com.chainsys.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main (String arg[]) {
		String obj="Vanakam da Mapla!!!";
		Pattern p= Pattern.compile("Mapla");
		Matcher m= p.matcher(obj);
		while(m.find()) {
			System.out.println("The Value is:"+m.group());
			System.out.println(" The Value End: "+m.end());
			System.out.println("The value Start:"+m.start());
		}
		System.out.println("While loop not Run");
		
	}

}
