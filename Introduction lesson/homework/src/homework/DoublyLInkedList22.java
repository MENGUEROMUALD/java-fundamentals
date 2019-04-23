package homework;

//executed from mainproject class

public class DoublyLInkedList22 <T> {
	
	private String listName;
	private Node22<T> prev, next;
	
	public DoublyLInkedList22() {
	this("Default List");
	}
	
	public DoublyLInkedList22(String listName) {
	this.listName = listName;
	
	}
	public void insertFront(Node22<T> node){
	if(prev == null) {
		prev = next = node; //this is the first node in the list
	}
	else{
		node.setPreviousNode(prev); //OR currentNode.nextNode = item
		prev.setNextNode(node);
		prev = node;
	}
	}
	
	public void insertBack(Node22<T> node){
		if(next == null) {
			next = prev = node; //this is the first node in the list
		}
		else{
			node.setNextNode(next);
			next.setPreviousNode(node); //OR currentNode.nextNode = item
			next = node;
		}
		}
	public void removeFront() throws Exception {
		if(prev == null) {
			throw new Exception("No more elements to remove from list");
		}
		else {
			Node22<T> tmp = prev.getPreviousNode();
			tmp.setNextNode(null);
		prev = tmp;
		}
	}
	public void removeBack() throws Exception {
		if(next == null) {
			throw new Exception("No more elements to remove from list");
		}
		else {
			Node22<T> tmp = next.getNextNode();
			tmp.setPreviousNode(null);
		next = tmp;
		}
	}
	public void printFromprev(){
		System.out.println("Printing from the Front(Head)");
		Node22 tmp = prev;
		
		while(prev != null){
		System.out.println(prev);
		prev = prev.getPreviousNode();
		}
		prev = tmp;
	}
	
	public void printFromnext(){
		System.out.println("Printing from the Tail");
		Node22 tmp = next;
		
		while(next != null){
		System.out.println(next);
		next = next.getNextNode();
		}
		next = tmp;
	}
	
	private boolean listIsEmpty(){
		return next == null;
		}

}
