
public class DoubleLinkList <T>{
	private String listName;
	private DoubleNode<T> end,currentNode,firstNode;
	public DoubleLinkList() {
		this("Default List"); 
}
public DoubleLinkList(String listName) {
		this.listName=listName; 
}

public void insertFront(DoubleNode<T> item){ 
	if(firstNode==null) 
		firstNode=end = item;
else {
	item.setPreviousNode(firstNode);
	firstNode.setNextNode(item);
	firstNode = item;
 
	}
}
public void insertBack(DoubleNode<T> item){ 
	if(firstNode==null) 
		firstNode=end = item;
else {
	end.setPreviousNode(item);
	end = item;
 
	}
}

public void removeFront(){ 
	if(firstNode==null)
		System.out.println("no more element to add"); 
	else {
		firstNode.previousNode.nextNode=null;
		//DoubleNode<T> tmp = (DoubleNode<T>)firstNode.getPreviousNode();
		//firstNode=tmp;
		//firstNode.setNextNode(tmp.getNextNode());
		firstNode=firstNode.getPreviousNode();
	}
		
}

public void removeBack() throws Exception{ 
	if(end==null)
		System.out.println("List is Empty"); 
	else {
		DoubleNode<T> tmp = end.getNextNode();
		tmp.setPreviousNode(null);
			end=tmp;
			//firstNode.setNextNode(tmp.getNextNode());
	}
	
}
public void printListHead(){ 
	System.out.println("print from head"); 
	DoubleNode<T> tmp=firstNode;
	while(firstNode != null){
		System.out.println(firstNode);
		firstNode = firstNode.getPreviousNode();
	}
	tmp=firstNode;
}
	public void printListBack(){ 
		System.out.println("print from tail"); 
		DoubleNode<T> tmp=end;
	while(end != null){
		System.out.println(end);
		end = end.getNextNode(); 
	}
	tmp=end;
}
private boolean listIsEmpty(){
		return currentNode==null; 

}
@Override
public String toString() {
	return "MySinglyLinkedList [listName=" + listName + ", currentNode=" + currentNode + ", firstNode=" + firstNode
			+ "]";
}
}
