package org.toubou.Lesson20;

public class Toy<T> {
	 T data;
	
	public Toy(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	 
}
