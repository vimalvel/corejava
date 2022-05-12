package com.chainsys.exception;

import java.util.Scanner;

public class DemoA {

    public static void m4()
    {
        System.out.println("before try");
        int x=0;
        int y=0;
        int z=0;
        String s1=null,s2=null;
        java.util.Scanner sc=null;
        try
        {
            sc=new Scanner(System.in);
            System.out.println("inside try");
            System.out.println("enter value for x");
            s1=sc.nextLine();
            System.out.println("enter value for y");
            s2=sc.nextLine();
            x=Integer.parseInt(s1);
            y=Integer.parseInt(s2);
            z=x/y;
            System.out.println("result"+z);
        }
        /*catch(Exception err)
        {
            System.out.println("inside catch3"+err.getMessage());
            System.out.println("errortype"+err.getClass().getName());
        }*/
        catch(ArithmeticException err)
        {
            System.out.println("inside catch1"+err.getMessage());
            System.out.println("errortype"+err.getClass().getName());
            
        }
        catch(NumberFormatException err)
        {
            System.out.println("inside catch1"+err.getMessage());
            System.out.println("errortype"+err.getClass().getName());
            
        }
        catch(Exception err)
        {
            System.out.println("inside catch1"+err.getMessage());
            System.out.println("errortype"+err.getClass().getName());
            
        }
        finally
        {
            System.out.println("inside finally");
        }
        
    }

}