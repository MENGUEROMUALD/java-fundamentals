
class Node<T>{
T data; 
Node<T> nextNode;


public Node(T data, Node<T> nextNode) { 
	this.data = data;
	this.nextNode = nextNode; 
}

public Node(T data){
this.data = data;
}

public T getData() {
return data; 
}

public void setData(T data) {
this.data = data; 
	}

public Node<T> getNextNode() {
	
return nextNode;

}
public void setNextNode(Node<T> item) {
	
this.nextNode = item; 

}
@Override
public String toString() {
	
return data.toString(); 
}
}
 