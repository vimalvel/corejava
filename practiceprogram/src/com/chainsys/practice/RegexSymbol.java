package com.chainsys.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSymbol {
	public static void main (String srgs[]) {
		String obj = "abcdefgABCDEFG123456";
		Pattern p = Pattern.compile("[a-z]|[A-Z]|[0-9]");
		Matcher m= p.matcher(obj);
	
	while(m.find()) {
		System.out.println("The value is:"+m.group());
		
	}
	
	
	}
	

}
