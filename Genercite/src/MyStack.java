import java.util.ArrayList;

public class MyStack<T> {
	ArrayList<T>bucket;
	
	
	MyStack(int size){
		bucket=new ArrayList<T>(size);
	}
	
	
	
	public void push(T item) {
		bucket.add(item);
	}
	
	
	
	public T pop() throws StackErrorException {
		if(bucket.size()<0) {
			
		 return bucket.remove(bucket.size()-1);
		
		}else {
			throw new StackErrorException("no more item");
		}
	}
	public void print(ArrayList<T> bucket) {
		for(T i :bucket) {
			bucket.get((int) i);
		}
	}
	



	public ArrayList<T> getBucket() {
		return bucket;
	}



	public void setBucket(ArrayList<T> bucket) {
		this.bucket = bucket;
	}

}
