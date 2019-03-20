package org.toubou.Lesson20;

import java.util.ArrayList;

public class MyStack<T> {
	ArrayList<T> bucket;

	public MyStack(int size) {
		bucket=new ArrayList<T>(size);
	}
	public void push(T item) {
		bucket.add(item);
	}
	public T pop() throws StackEmptyException {
		if(bucket.size() > 0)
		 return bucket.remove(bucket.size() - 1);
		else		
			throw new StackEmptyException("No more items to pop");
	}
	
	public void display() {
		for(T item:bucket )
			System.out.printf(" %s ", item.toString());
	}

}
