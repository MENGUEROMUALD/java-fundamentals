package org.toubou.Lesson22;

public class MyDoubleLinkedList<T> {
	 private String listName;
	    private Node<T> currentNode,firstNode,lastNode;
		public MyDoubleLinkedList() {
			this("Default List");
		}
	    
		public MyDoubleLinkedList(String listName) {
			this.listName = listName;
		}

		public void insertFront(Node<T> item) {
			if(lastNode==null)
				currentNode=firstNode=lastNode=item;
			else {
				lastNode.setNextNode(item);
				item.setPreviousNode(lastNode);
				lastNode=item;
			}
		}
		public void insertBack(Node<T> item) {
			if(firstNode==null)
				currentNode=firstNode=lastNode=item;
			else {
				firstNode.setPreviousNode(item);
				item.setNextNode(firstNode);
				firstNode=item;
			}
		}
		public void removeFront() throws Exception {
			if(lastNode==null)
				throw new Exception ("No more element to remove from the list");
			else {
				lastNode=lastNode.previousNode;
				lastNode.nextNode=null;
			}
		}
		public void removeBack() throws Exception {
			if(firstNode==null)
				throw new Exception ("No more element to remove from the list");
			else {
				firstNode = firstNode.nextNode;
				firstNode.previousNode = null;
			}
		}
		public void printFrontHead() {

			System.out.println("Printing from the Head the list "+listName);
			Node<T> tmp=firstNode;
			while(firstNode != null){
			
				System.out.println(firstNode.getData());
				firstNode = firstNode.getNextNode();
			}
			firstNode=tmp;

		}
		public void printFrontTail() {

			System.out.println("Printing from the Tail the list "+listName);
			Node<T> tmp=lastNode;
			while(lastNode != null){
			
				System.out.println(lastNode.getData());
				lastNode = lastNode.getPreviousNode();
			}
			lastNode=tmp;
			
		}

		@Override
		public String toString() {
			return "MyDoubleLinkedList [listName=" + listName + ", currentNode=" + currentNode + ", firstNode="
					+ firstNode + ", lastNode=" + lastNode + "]";
		}
		
		
}
