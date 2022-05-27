package com.chainsys.jdbc;

import java.sql.*;  
import java.io.*;  

public class InsertImage 
{  
    public static void main(String[] args) 
    { 
        insert();
        //retrieve();
    }
    public static void insert()
    {
     try
     {  
         Class.forName("oracle.jdbc.driver.OracleDriver");  
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");  
         PreparedStatement ps=con.prepareStatement("insert into emgtable values(?,?)");  
         ps.setString(1,"kalai");  
  
         FileInputStream fin=new FileInputStream("d:\\jpg.jpg");  
         ps.setBinaryStream(2,fin,fin.available());  
         int i=ps.executeUpdate();  
         System.out.println(i+" records affected");   
         con.close();  
     }
     catch (Exception e) 
     {
         e.printStackTrace();
     }  
    }  
    public static void retrieve()
    {  
        try
        {  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");        
        PreparedStatement ps=con.prepareStatement("select * from emgtable");  
        ResultSet rs=ps.executeQuery();  
        if(rs.next())
        {              
            Blob b=rs.getBlob(2);//2 means 2nd column data  
            byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
                      
            FileOutputStream fout=new FileOutputStream("d:\\kalai.jpg");  
            fout.write(barr);               
            fout.close();  
        }  
        System.out.println("ok");                
        con.close();  
        }
        catch (Exception e) 
        {
            e.printStackTrace(); 
        }  
    }  
}