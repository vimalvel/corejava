package com.chainsys.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Modify {

	public static void main(String[] args) throws IOException
	    {
	         FileOutputStream file = new FileOutputStream("C:\\Demo\\Pravi.txt");
	        
	         String modify = "HELLO.";
	         byte[] b = modify.getBytes();
	         file.write(b);
	         file.close();
	         System.out.println("Modification Complete");
	         
	         FileInputStream file1 = new FileInputStream("C:\\Demo\\Pravi.txt");
	         int i;
	         while((i=file1.read())!=-1)
	         {
	         System.out.print((char)i);
	         }
	         file1.close(); 
	    }
	}


