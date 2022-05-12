package com.chainsys.exception;

public class DemoTrace {
    public static void main(String args[])
    {
        m1();
    }
    public static void m1()
    {
        try
        {
            m2();
        }
        catch(Exception err)
        {
            System.out.println("getmessage"+err.getMessage());
            err.printStackTrace();
            /*Throwable t1=err.getCause();
            if(null!=t1)
            {
                class c1=t1.getClass();
            System.out.println("cause"+c1.getName());
            }
            else
                System.out.println("cause is null");*/
        }
        finally
        {
            System.out.println("inside m1 finally");
        }
    }
    public static void m2()
    {
        m3();
    }
    public static void m3()
    {
        m4();
    }
    public static void m4()
    {
        int x=0;
        int y=0;
        int z=0;
        x=100;
        z=x/y;
        System.out.println("result"+z);
    
        
    }
    public static void m5() throws Exception
    {
        Exception e1=new Exception("error 1");
        //inner exception
        //e1 is nested inside e2
        Exception e2=new Exception ("error 2",e1);
        throw e2;
    }
    public static void testm5()
    {
        try {
            m5();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("inside catch"+e.getMessage());
            Throwable t1=e.getCause();
            System.out.println("cause"+t1.getMessage());
        }
    }

}