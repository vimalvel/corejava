package com.chainsys.bytestream;

import java.io.IOException;

public class SystemIn {
    public static void main(String args[])throws IOException
    {
        System.out.println(System.in.getClass().getName());
        System.out.println(System.out.getClass().getName());
        System.out.println("please enter a char:");
        int c1=System.in.read();
        System.out.println(c1);
        char c2=(char)c1;
        System.out.println(c2);
    }

}