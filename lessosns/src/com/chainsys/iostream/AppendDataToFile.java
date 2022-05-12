package com.chainsys.iostream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendDataToFile{
public static void main(String args[])
{
    File obj=new File("D:\\Temp\\Test.txt");
  Scanner scanner = new Scanner(System.in);
  System.out.println("\nEnter the data : ");  
  String text = scanner.nextLine();

    try {
        FileWriter fw = new FileWriter("C:\\Demo\\Pravi.txt", true);
        fw.append(text);
        fw.close();
        System.out.println("Data inserted(append) Successfully!!");
    }
    catch(IOException e) {
        System.out.println("Error occured!!");
    }
    }
}