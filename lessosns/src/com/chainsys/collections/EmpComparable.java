package com.chainsys.collections;

public class EmpComparable implements Comparable<EmpComparable>{
    private final int id;
    public String Name;

    public EmpComparable(int v1){
             id = v1;
    }
    public int getId(){
        return getId();
    }
    public boolean equals(Object obj){
        Class c1 = obj.getClass();
        boolean flag = false;
        if(c1 == this.getClass()){
            EmpComparable other = (EmpComparable)obj;
            if(this.hashCode() == other.hashCode()){
                flag = true;
            }
        }
        return flag;
        
    

    }
    public int hashCode(){
        return id;

    }
    @Override
    public int compareTo(EmpComparable other){
        int result = 0;
         result = Integer.compare(this.getId(), other.getId());
         return result;
    }
}