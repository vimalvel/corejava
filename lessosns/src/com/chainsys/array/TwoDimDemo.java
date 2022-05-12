package com.chainsys.array;

public class TwoDimDemo {
    public static void creatingTwoDimsionArray()
    {
        int twod[][]=new int [4][5]; // 4 rows and 5 columns
        int rowIndex,colIndex =0;
        int data=0;
        for(rowIndex=0;rowIndex<4;rowIndex++)
        {
            for(colIndex=0;colIndex<5;colIndex++)
            {
                twod[rowIndex][colIndex]=data;
                data++;
            }
        }
        for(rowIndex=0;rowIndex<4;rowIndex++)
        {
            for(colIndex=0;colIndex<5;colIndex++)
            {
                System.out.print(twod[rowIndex][colIndex]+",");
            }
            System.out.println();
        }
    }
    public static void calculateTotalandAverage()
    {
        int marks[][]= new int [][]
                {
            {82,34,43,45,67,0,0},
            {82,34,43,45,67,0,0},
            {82,34,43,45,67,0,0},
            {82,34,43,45,67,0,0},
            {82,34,43,45,67,0,0}};            // 5 rows and 7 Columns
            
            int rowIndex,colIndex = 0,sum = 0,avg=0;
            int data=0;
            for(rowIndex=0;rowIndex<5;rowIndex++)
            {
                for(colIndex=0;colIndex<7;colIndex++)
                {
                    sum+=marks[rowIndex][colIndex];
                }
                marks[rowIndex][5]=sum;
                marks[rowIndex][6]=sum/5;
                sum=0;
    }
            //Display the marks, Total andAverage
            int subjectNo=1;
            for(subjectNo=1;subjectNo<=5;subjectNo++)
            {
                System.out.print("Sub" +(subjectNo)+ "-");
            }
            System.out.print("Total -");
            System.out.println("Avg");
            System.out.println("-------------------------------------");
            //
            String output=" ";
            for(rowIndex=0;rowIndex<5;rowIndex++)
            {
                for(colIndex=0;colIndex<7;colIndex++)
                {
                    int mark=marks[rowIndex][colIndex];
                    if(mark<100)
                    {
                        output=String.format("0%d  - ",mark);
                    }
                    else
                    
                        output=String.format("%d   - ",mark);
                    System.out.print(output);
                }
                System.out.println();
                }        
        }
    public static void fewOtherWaysOfCreatingTwoDimArray()
    {
        int []a[]=new int [4][4];            //Column for all the rows are equal
        int a1[][]= new int [4][4];
    //    int a2[][]= new int [][4];            // Wrong
        int []a3[]=new int [4][];             // Uneven 2D arrays the column for all the rows are not equal
        
        int [][]a4 = new int[4][];            // Column for all the rows are equal
        int [][]a5 = new int [4][4];        // Column for all the rows are equal
        int []i[]= {{1,2},{3,4},{5,6},{7,8}};    //Column for all the rows are equal
        int k[][]= new int [][] {{1,2,3},{4,5,6}};
    }
    public static void unevenTwoDArray()
    {
        int unevenTwoD[][]= new int[4][];
        unevenTwoD[0]=new int [1];
        unevenTwoD[1]=new int [4];
        unevenTwoD[2]=new int [3];
        unevenTwoD[3]= new int[2];
        int rowIndex,colIndex,rowLength=0,data=100;
        for(rowIndex=0;rowIndex<4;rowIndex++)
        {
            rowLength=unevenTwoD[rowIndex].length;
            for(colIndex=0;colIndex<rowLength;colIndex++)
            {
                unevenTwoD[rowIndex][colIndex]=data;
                data++;
            }
        }
        for(rowIndex=0;rowIndex<4;rowIndex++)
        {
            rowLength=unevenTwoD[rowIndex].length;
            for(colIndex=0;colIndex<rowLength;colIndex++)
            {
                System.out.print(unevenTwoD[rowIndex][colIndex]+" ");
            }
            System.out.println();
        }
        
    }

}