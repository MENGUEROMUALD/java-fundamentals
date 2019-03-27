package org.toubou.Lesson22;

public class MySinglyLinkedList<T> {
    private String listName;
    private Node<T> currentNode,firstNode;
	public MySinglyLinkedList() {
		this("Default List");
	}
	public MySinglyLinkedList(String listName) {
		this.listName = listName;
	}
    
	public void insert(Node<T> item) {
		if(listIsEmpty())
			currentNode=firstNode=item;
		else {
			currentNode.setNextNode(item);
			currentNode=item;
		}
	}
	public void remove() {
		if(firstNode==null)
			System.out.println("List is Empty");
		else
			firstNode=firstNode.getNextNode();
				
	}
	
	public void printList() {

		System.out.println(listName);
		Node<T> tempNode = firstNode;
		
		while(firstNode != null){
		
			System.out.println(firstNode.getData());
			firstNode = firstNode.getNextNode();
		}
		
		firstNode = tempNode;

	}
	
	private boolean listIsEmpty() {
		return currentNode==null&firstNode==null;
	}
	@Override
	public String toString() {
		return "[listName=" + listName + ", currentNode=" + currentNode + ", firstNode=" + firstNode
				+ "]";
	}
	
}
