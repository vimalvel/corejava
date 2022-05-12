package com.chainsys.iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {
public static void main(String arg[]) {
try
{
 File file=new File("C:\\Demo\\Pravi.txt");
BufferedReader read=new BufferedReader(new FileReader(file));
 String reader;
 while((reader=read.readLine())!=null)
 System.out.println(reader);
}catch(Exception err) {
 System.out.println("File not found");}
}
}
