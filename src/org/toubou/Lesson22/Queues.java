package org.toubou.Lesson22;

public class Queues<T> extends MyDoubleLinkedList<T> {
	public void enqueues(Node<T> node) {
		insertBack(node);
	}
	public void dequeues() {
		try {
			removeFront();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void print() {
		printFrontHead();
	}
}
