package com.chainsys.collections;

public class Employee {
	 private final int id;
	    public String Name;
	    public Employee (int v1) {
	        id = v1;
	    }
	    public int getID() {
	        return id;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        Class c1 = obj.getClass();
	        boolean flag = false;
	        if (c1 == this.getClass()) {
	        	Employee other = (Employee) obj;
	            if (this.hashCode() == other.hashCode())
	                flag = true;
	        }
	        return flag;
	    }
	    @Override
	    public int hashCode() {
	        return this.id;
	    }
	    

}
