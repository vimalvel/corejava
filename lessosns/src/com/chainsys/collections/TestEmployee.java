package com.chainsys.collections;

public class TestEmployee {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
		 Employee firstEmp=new Employee(111);
		 Employee secondEmp=new Employee(111);
	        System.out.println(firstEmp.hashCode());
	        System.out.println(secondEmp.hashCode());
	        boolean result=firstEmp.equals(secondEmp);
	        System.out.println(result);
	        result=firstEmp.equals(firstEmp);
	        System.out.println(result);
	        result=firstEmp.equals("Hello");
	        System.out.println(result);

	    }

}
