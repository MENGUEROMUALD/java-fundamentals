package homework;

// Executed in mainprojectclass

// Singly LinkedList

public class SinglyLinkedList22 <T>{
	
		private String listName;
		private Node22<T> currentNode,firstNode;
		
		public SinglyLinkedList22() {
		this("Default List");
		}
		
		public SinglyLinkedList22(String listName) {
		this.listName = listName;
		
		}
		public void insert(Node22<T> item){
		if(listIsEmpty())
			currentNode = firstNode = item; //this is the first node in the list
		else{
			currentNode.setNextNode(item); //OR currentNode.nextNode = item
			currentNode = item;
		}
		}
		
		public void remove(){
			if(firstNode == null)
				System.out.println("List is Empty");
			else
				firstNode = firstNode.getNextNode();
			}
		
		public void printList(){
			System.out.println(listName);
			currentNode = firstNode;
			
			while(firstNode != null){
			System.out.println(firstNode.getData());
			firstNode = firstNode.getNextNode();
			}
			firstNode = currentNode;
			}
		
		private boolean listIsEmpty(){
			return currentNode == null;
			}

}
