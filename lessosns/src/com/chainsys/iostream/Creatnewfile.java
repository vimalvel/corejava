package com.chainsys.iostream;

import java.io.File;
import java.io.IOException;
public class Creatnewfile {
	
	public static void main(String args[]) throws IOException
	{
	
		File obj=new File("C:\\Demo\\Diwn.txt");
		boolean present=obj.exists();
		
		if(present==false) {
			try {
			boolean created=obj.createNewFile();
			System.out.println("File Created"+created);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}