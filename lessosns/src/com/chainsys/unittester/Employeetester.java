package com.chainsys.unittester;

import com.chainsys.classandmethod.Employee;

public class Employeetester {
	public static void testemployeename() {
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setName("vimal vel");
		System.out.println(firstEmployee.getName());
		
	}
	public static void testempID() {
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setName("vimal");
		System.out.println(firstEmployee.getName());
	}
	public static void testempcity() {
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setcity("Chennai");
		System.out.println(firstEmployee.getcity());
	}
	public static void testempsalary() {
		Employee firstEmployee = new Employee(1234);
		firstEmployee.setsalary(100000);
		System.out.println(firstEmployee.getsalary());
	}
	
	

}
