package com.java.generics;

public class GenericsDemo<T> implements Comparable<GenericsDemo>{
	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public GenericsDemo(T t) { 
        this.t = t;
    } 
	
	public boolean equals(Object o) { 
		  
        
        if (o == this) { 
            return true; 
        } 
  
        
        if (!(o instanceof GenericsDemo)) { 
            return false; 
        } 
        GenericsDemo<T> t1=(GenericsDemo) o;
        return this.t.equals(t1.t);
    } 
	
	public static void main(String args[]){
		GenericsDemo<String> type2 = new GenericsDemo<>("Deepa");
		GenericsDemo<String> type = new GenericsDemo<>("Deepa");
		type.set("Pankaj"); 
		
		System.out.println(type.equals(type2));
	}

	@Override
	public int compareTo(GenericsDemo o) {
		// TODO Auto-generated method stub
		if(t==o.t)  
			return 0;  
		else return 1;
	}
		
}
