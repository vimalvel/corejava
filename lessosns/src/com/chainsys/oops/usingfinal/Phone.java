package com.chainsys.oops.usingfinal;

public class Phone {
    public void makeAcall()
    {
    System.out.println("call made...");

}
    public final void sendsms()
    {
        System.out.println("sms send...");
    }
}
class Nokia extends Phone
{
    @Override
    public void makeAcall()
    {
        System.out.println("call made from nokia");
    }
    //@Override
    //public void sendsms()
    //{
        //System.out.println("sms send...");
    //}
}