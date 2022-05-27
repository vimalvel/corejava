package com.chainsys.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Preparedstatement 
{
    public static void main(String[] args) throws Exception,SQLException
    {

        int call=5;
        switch(call)
        {
        case 0:
            create();
            break;
        case 1:
            insert();
            break;
        case 2:
            update();
            break;
        case 3:
            view();
            break;
        case 4:
            delete();
            break;
        case 5:
            metaData();
            break;
        }
    }
    
    public static void insert() throws Exception
    {
    	 Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
        PreparedStatement stmt=con.prepareStatement("insert into JDBC values(?,?,?,?,?)");
        //insert details in console
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
        do
        {
        System.out.println("enter id:");  
        int id=Integer.parseInt(br.readLine());  
        System.out.println("enter name:");  
        String name=br.readLine();  
        System.out.println("enter age:");  
        int age=Integer.parseInt(br.readLine());
        System.out.println("enter dept:");  
        String dept=br.readLine();
        System.out.println("enter marks:");  
        int marks=Integer.parseInt(br.readLine());
        //values sets in table
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setInt(3,age);
        stmt.setString(4,dept);
        stmt.setInt(5,marks);
        
        //checking whether the table is inserted or not
        int i=stmt.executeUpdate();
        System.out.println(i+ " row inserted");    
        
        System.out.println("Do you want to continue: y/n");  
        String s=br.readLine();  
        if(s.startsWith("n"))
        {  
            break;  
        }  
        }while(true); 
        con.close();
    }
    public static void update() throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
        PreparedStatement stmt=con.prepareStatement("update JDBC set id=? where id=?");  
        stmt.setInt(1,3120);
        stmt.setInt(2,310);  
          
        int i=stmt.executeUpdate();  
        System.out.println(i+" records updated");  
    }
    public static void view() throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
        PreparedStatement stmt=con.prepareStatement("select * from JDBC");  
        ResultSet rs=stmt.executeQuery();  
        while(rs.next())
        {  
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));  
        }  
    }
    public static void delete() throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
        PreparedStatement stmt=con.prepareStatement("delete from JDBC where id=?");  
        stmt.setInt(1,101);  
          
        int i=stmt.executeUpdate();  
        System.out.println(i+" records deleted");  
    }
    private static void metaData() throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
        PreparedStatement stmt=con.prepareStatement("select * from JDBC");  
        ResultSet rs=stmt.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();  
        System.out.println("Total columns: "+rsmd.getColumnCount());  
        System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
        System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
    }
    private static void create() throws SQLException
    {
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
        Statement stmt = con.createStatement();
         String sql="CREATE TABLE JDBC" +
         "(ID INTEGER NOT NULL," + 
         "NAME VARCHAR2(20)," + 
         "AGE INTEGER NOT NULL," + 
         "DEPT VARCHAR2(25) NOT NULL," +
         "MARKS INTEGER NOT NULL," +
         "PRIMARY KEY(ID))";
         stmt.executeUpdate(sql);
         System.out.println("Created table in given Database"); 
    }
}
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter ID");
//int id=sc.nextInt();
//System.out.println("Enter Name");
//String name=sc.nextLine();
//System.out.println("Enter Age");
//int age=sc.nextInt();
//System.out.println("Enter Dept");
//String dept=sc.nextLine();
//System.out.println("Enter Marks");
//int marks=sc.nextInt();
//stmt.setInt(1, 100);
//stmt.setString(2, "aravind");
//stmt.setInt(3,23);
//stmt.setString(4,"ece");
//stmt.setInt(5,90);