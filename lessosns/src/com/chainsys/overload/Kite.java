package com.chainsys.overload;

public class Kite {
    void fly(int distance)
    {
        System.out.println("fly1"+distance);
    }
    void fly(double time,int speed)
    {
        System.out.println("fly1"+time);
    }
    int fly(int time,int speed)
    {
        return time*speed;
    }
    void fall(String time)
    {
        System.out.println("fall1"+time);
    }
    int fall(int distance)
    {
        System.out.println("fall2"+distance);
        return distance;
    }
    void glide(int time)
    {
        System.out.println("glide1"+time);
    }
    void glide(double time)
    {
        System.out.println("glide2"+time);
    }

}