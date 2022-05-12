package com.chainsys.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy{
public static void main(String args[]) throws IOException {
    
    try 
    {
        InputStream input=new FileInputStream("C:\\Demo\\Pravi.txt");
        OutputStream output=new FileOutputStream("C:\\Demo\\New folder\\Pravi.txt ");
        int content=input.read();
        while(content != -1)
        {
            output.write(content);
            content=input.read();
        }
        output.flush();
    }
    catch (IOException e) 
    {
        e.printStackTrace();
    }
}
}