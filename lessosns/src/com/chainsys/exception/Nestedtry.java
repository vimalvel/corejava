package com.chainsys.exception;

import java.util.Scanner;

public class Nestedtry {
    static String[]data;
    public static void main(String args[])
    {
        int num=0;
        int numvalue=0;
        data =new String[2];
        java.util.Scanner sc=null;
    
        try
        {
            sc=new Scanner(System.in);
            try
            {
      System.out.println("enter value for x");
      data[0]=sc.nextLine();//123---abcd--123
      numvalue=Integer.parseInt(data[0]);
      System.out.println("the sqaure is "+numvalue*numvalue);
            }
            catch(NumberFormatException nb)
            {
            System.out.println("not a number!");    
            }
            num=data.length;
            System.out.println("array length"+num);
        }catch(ArrayIndexOutOfBoundsException ne)
        {
            System.out.println("arrayindexoutofbounds-no arguments given!!!");
            
        }
        catch(Exception er)
        {
            System.out.println("Excetion "+er.getMessage());
        }
}
}