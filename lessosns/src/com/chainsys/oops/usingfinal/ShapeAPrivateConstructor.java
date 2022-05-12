package com.chainsys.oops.usingfinal;

public class ShapeAPrivateConstructor {
    public int height;
    public int width;
    private ShapeAPrivateConstructor()
    {
        System.out.println("shapeA createdA "+hashCode());
    }
    private ShapeAPrivateConstructor(int x)
    {
        height=x;width=x;
        System.out.println(x+"shapeA createdB"+hashCode());
    }
    public void echo()
    {
        System.out.println("shapeA echo...");
        System.out.println(height+" "+width);
    }
    public static ShapeAPrivateConstructor getObject()//factory method
    {
        return new ShapeAPrivateConstructor();//call to private constructor
    }

}