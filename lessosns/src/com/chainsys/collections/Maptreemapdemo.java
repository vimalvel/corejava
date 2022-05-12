package com.chainsys.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Maptreemapdemo {
    public static void main(String args[])
    {
        TreeMap<String,Double>tm=new TreeMap<String,Double>();
        tm.put("john doe", 3434.34);
        tm.put("Tom smith", 123.22);
        tm.put("john doe", 1378.00);
        tm.put("john doe", 99.22);
        tm.put("john doe",-19.08);
        Set<Map.Entry<String,Double>>Set=tm.entrySet();
        Iterator<Map.Entry<String,Double>>i=Set.iterator();
        while(i.hasNext())
        {
            Map.Entry<String,Double>me=i.next();
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
        System.out.println();
        //deposit 1000 into john doe's account
        double balance =tm.get("john doe");
        tm.put("john doe", (balance+1000));
        System.out.println("john doe's new balance:"+tm.get("john doe"));
        
    }
    

}