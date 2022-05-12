package com.chainsys.collections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class Dictionarypropdemo {
    public static void main(String args[])
    {
        Properties capitals=new Properties();
        Set<Object>states;
        String str;
        capitals.put("Illinois", "Springfield");
        capitals.put("Florida", "Tallahasee");
        capitals.put("Missouri", "Jefferson city");
        capitals.put("Wasington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");
        states=capitals.keySet();//get set-view of keys
        Iterator<Object>itr=states.iterator();
        while(itr.hasNext())
        {
            str=(String)itr.next();
            System.out.println("The capital of "+str+ " is " +capitals.getProperty(str)+".");
        }
        //look for state not in list--specify default
        str=capitals.getProperty("Tamilnadu","Not Found");
        //str=capitals.getProperty("Florida");
        System.out.println("The capital of Tamilnadu is "+str);
    }

}