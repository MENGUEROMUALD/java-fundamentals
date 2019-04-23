package homework;
//main at mainprojectclass

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// we cannot use an arraylist to create stacks because it is first in last out. an arraylist can get elements at any index.

public class Stack22<T> extends DoublyLInkedList22 {
	
	private String Stackname;
	private List<T> list = new LinkedList<T>(); 

	public Stack22(String stackname) {
		super();
		this.Stackname = stackname;
	}
	
	public void push(Node22<T> node) {
		insertFront(node);
	}
	
	public void pop() throws Exception {
		removeFront();
	}

	public void print() {
		printFromprev();
	}

}
