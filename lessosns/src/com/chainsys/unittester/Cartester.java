package com.chainsys.unittester;
import com.chainsys.classandmethod.Car;
/**
 * 
 * @author vimal3103
 * 
 */

public class Cartester {
	public static void testCar()
	{
		Car firstCar=new Car("Tn 10A 001");
		firstCar.setColor("Red");
		firstCar.setFuel("Petrol");
		firstCar.setYearofpurchase(2022);
		System.out.println(firstCar.getregno());
		System.out.println(firstCar.getYearofpurchase());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
	}

}
