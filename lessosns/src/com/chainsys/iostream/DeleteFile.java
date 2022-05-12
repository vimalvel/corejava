package com.chainsys.iostream;

import java.io.File;

public class DeleteFile{
public static void main(String arg[]) {
    try
    {
    File obj=new File("C:\\Demo\\Pravi.txt");
    boolean delete=obj.delete();
    if(delete)
        System.out.println("Successfully deleted");
    }catch(Exception err) {
        System.out.println("File not found");
}
    }
}
