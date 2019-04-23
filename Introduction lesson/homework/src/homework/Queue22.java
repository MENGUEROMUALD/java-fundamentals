package homework;
//main at mainprojectclass

public class Queue22<T> extends DoublyLInkedList22<T> {
	
	private String Queuename;
	
	public Queue22(String queuename) {
		super();
		Queuename = queuename;
	}
	public void enqueue(Node22<T> node) {
		insertBack(node);
	}
	public void dequeue() throws Exception {
		removeFront();
	}
	public void print(){
		printFromprev();
	
	}

}
