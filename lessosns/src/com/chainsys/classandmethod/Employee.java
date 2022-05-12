package com.chainsys.classandmethod;
/**
 * this a class that contains employee related data
 * the person has id,name,city and salary properties
 * 
 * @author vimal3103
 * created on 25 march 2022
 *
 */


public class Employee {
	private final int empID;
	private String name;
	private String city;
	private long salary;
	// constructor
	public Employee(int id)
	
	{
		//assigning value to readonly field
		this.empID=id;
			}
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getempID()
	{
	return empID;	
	}
	public String getcity(){
		return city; 
		}
	
	public void setcity(String city)
	{
		this.city=city;
		
	}
	public long getsalary() {
		return salary;
	}
	public void setsalary(long salary)
	{
		this.salary=salary;
	}
	
}
