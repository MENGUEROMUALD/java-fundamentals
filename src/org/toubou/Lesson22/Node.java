package org.toubou.Lesson22;

public class Node<T> {
T data;  //the data of the node
Node<T> nextNode,previousNode;  //the link to the next node
public Node(T data, Node<T> nextNode) {
	this.data = data;
	this.nextNode = nextNode;
}

public Node(T data, Node<T> nextNode, Node<T> previousNode) {
	this.data = data;
	this.nextNode = nextNode;
	this.previousNode = previousNode;
}

public Node(T data) {
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
public void setNextNode(Node<T> nextNode) {
	this.nextNode = nextNode;
}

public Node<T> getPreviousNode() {
	return previousNode;
}
public void setPreviousNode(Node<T> previousNode) {
	this.previousNode = previousNode;
}
@Override
public String toString() {
	return data.toString();
}



}
