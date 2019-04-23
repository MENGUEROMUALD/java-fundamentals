package homework;
// run in Main15

import java.util.ArrayList;

public class Stack20<T> {
	
	ArrayList<T> bucket;
	
	Stack20(int size){
		bucket = new ArrayList<T>(size);
	}
	public void push(T item){
		bucket.add(item);
	}
	public T pop() throws StackEmptyException{
		if(bucket.size() > 0)
			return bucket.remove(bucket.size() - 1);
		else
			throw new StackEmptyException("No more items to pop");
	}
	
	public void printStack() {
		for(T s : bucket)
			System.out.println(s);
		
	}

}
