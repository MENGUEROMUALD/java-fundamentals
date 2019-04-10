
public class DoubleNode <T>  {
	T data; 
	DoubleNode<T> nextNode,previousNode;
	

	/*public Node(T data, Node<T> nextNode) { 
		this.data = data;
		this.nextNode = nextNode; 
	}

	public Node(T data){
	this.data = data;
	}*/
	
	public DoubleNode(T data){
	this.data = data;
	}

	

	public DoubleNode(T data, DoubleNode<T> nextNode, DoubleNode<T> previousNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
		this.previousNode = previousNode;
	}



	public T getData() {
	return data; 
	}

	

	
	public DoubleNode<T> getNextNode() {
		return nextNode;
	}



	public void setNextNode(DoubleNode<T> nextNode) {
		this.nextNode = nextNode;
	}



	public DoubleNode<T> getPreviousNode() {
		return previousNode;
	}



	public void setPreviousNode(DoubleNode<T> previousNode) {
		this.previousNode = previousNode;
	}



	public void setData(T data) {
		this.data = data;
	}



	@Override
	public String toString() {
		
	return data.toString(); 
	}
}
