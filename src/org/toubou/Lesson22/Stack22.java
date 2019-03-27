package org.toubou.Lesson22;

import java.util.ArrayList;
import java.util.List;

public class Stack22<T> {
     private String stackname;
     private List<T> list = new ArrayList<T>();
     
     
	public Stack22(String stackname) {
		this.stackname = stackname;
	}
	public String getStackname() {
		return stackname;
	}
	public void setStackname(String stackname) {
		this.stackname = stackname;
	}
    
	public void insert(T item) {
		 list.add(item);
		 
	};
     
    public void remove() throws Exception {
    	if(list==null)
			throw new Exception ("No more element to remove from the list");
		else {
			list.remove(list.size()-1);
		}

    }
    
    public void display() {
    	System.out.println("Elements of stack " +stackname +":\n");
    	for (T it:list) {
    		System.out.printf("%s", it.toString());
    		System.out.println();
    	}
    }
}
