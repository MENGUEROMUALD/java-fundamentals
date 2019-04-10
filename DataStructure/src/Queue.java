
public class Queue<T> extends DoubleLinkList <T> {
	
	public void endqueue(DoubleNode<T> node) {
		insertBack(node);
	}
	public T dequeue() {
		removeFront();
		return null;
	}
	public void print() {
		 printListHead();
	}
}
