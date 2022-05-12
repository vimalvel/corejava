package com.chainsys.array;

import java.util.Arrays;
import java.util.Scanner;

public class DemoA {
    public static void creatingSingleDimensionArrays()
    {
        int firstArray[]=new int [10];
        
        int secondArray[]= {1,2,3,4};
        System.out.println(firstArray);
        System.out.println(firstArray.hashCode());
        System.out.println(secondArray);
    }
    public static void creatingArrays()
    {
        int firstValue=100;
        int[]numbers = {10,20,30,40,50};
        int lengthOfNumbers=numbers.length;
        System.out.println("lenght of numbers ="+lengthOfNumbers);
        for(int x: numbers)
        {
            System.out.println(x +" ");
        }
    }
    public static void creatingAnotherArray()
    {
        //An arrays is declared , but not instantiated
        // Here days is a reference 
        int days[] = null;
        if(days==null)
        {
            System.out.println("Days is null");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size for days");
        int size =sc.nextInt();
        days= new int [size];
        if (days!=null)
        {
            System.out.println("Days is not null");
        }
        int lengthofdays=days.length;
        System.out.println("No of days : "+ lengthofdays);    
        for(int i=0;i<lengthofdays;i++)
        {
            days[i]=(int) (Math.random()*10);
        }
        for(int x:days)
        {
            System.out.println(x);
        }
    }
    public static void createMonthArray()
    {
        int month[]=new int[12];
        
        int lenghtofMonthArray=month.length;
        System.out.println("Array length is : "+lenghtofMonthArray);
        for(int i=0;i<lenghtofMonthArray;i++)
        {
            System.out.print(i+ "-"+month[i]+ ","); // Month[i] will be zero
        }
        System.out.println();
        month[1]=31;
        for(int i=0;i<lenghtofMonthArray;i++)
        {
            System.out.println(i+ "-"+month[i]+ ","); 
        }
        try
        {
        month[12]=31;
        //month[11]=31;
        System.out.println("Hi ...");// Upper index is length -1
        }
        catch(Exception err)
        {
            System.out.println("Error !!! ...+ " + err.getMessage());
        }
        int anotherMonth[]= {31,28,34,12,11,45,78};
        lenghtofMonthArray= anotherMonth.length;
        
        for (int i=0;i<lenghtofMonthArray;i++)
        {
            System.out.println(i+ "-"+anotherMonth[i]+ ",");
        }    
    }
    /**
     * java.util.Arrays
     */
    public static void workingWithArrayClass()
    {
        int numberArray[]= new int [10];
        for(int i=0;i<10;i++)
            numberArray[i]=-3*i;
        System.out.println("Original contents :" );
        int lengthofthearray =numberArray.length;
        System.out.print("Array length is: "+lengthofthearray);
        
        for(int i=0;i<lengthofthearray;i++)
        {
            System.out.println(numberArray[i]+ " ");
        }
        // Arrays sort
        Arrays.sort(numberArray);
        System.out.println("Sorted :");
        for(int i=0;i<lengthofthearray;i++)
        {
            System.out.print(numberArray[i]+ " ");
        }
        Arrays.fill(numberArray,2,6,-1);
        System.out.println();
        System.out.println("After fill");
        for(int i=0;i<lengthofthearray;i++)
        {
            System.out.print(numberArray[i]+ " ");
        }
        System.out.println();
        
        int index = Arrays.binarySearch(numberArray, -9);
        System.out.println(index); // wrong value
        Arrays.sort(numberArray);
        for(int i=0;i<lengthofthearray;i++)
        {
            System.out.print(numberArray[i]+ " ");
        }
        index= Arrays.binarySearch(numberArray, -9);
        System.out.println(index);
    }
    public static void workingWithCharArray()
    {
        String s1= "Today sis very hot day";
        char[] data =s1.toCharArray();
        int count = data.length;
        System.out.println("Array length "+count);
        for(int i=0;i<count;i++)
        {
            System.out.println(data[i]+ " "+(int) data[i]);
        }
    }
}