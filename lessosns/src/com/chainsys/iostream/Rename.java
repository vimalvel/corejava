package com.chainsys.iostream;

import java.io.File;
import java.io.IOException;
public class Rename{
public static void main(String args[]) throws IOException {
  {
	File obj=new File("C:\\Demo\\Diwn.txt");
	obj.createNewFile();
	File newname=new File("C:\\Demo\\Pravi.txt");
	boolean rename=obj.renameTo(newname);
	System.out.println("RenameSuccess"+rename);
	}
	}
}


