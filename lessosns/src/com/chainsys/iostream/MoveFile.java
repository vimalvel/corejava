package com.chainsys.iostream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile{
public static void main(String ags[]) throws IOException {
    try
    {
    Path movefile=Files.move(Paths.get("C:\\Demo\\Pravi.txt"),Paths.get("C:\\vimal\\Pravi.txt"));
        if(movefile!=null)
            System.out.println("file moved successfully");
    }
    catch(Exception err){
        System.out.println("File not Found");
    }
}
}