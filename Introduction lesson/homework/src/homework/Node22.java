package homework;

public class Node22 <T>{
	
		T data; //the data for this node
		Node22<T> nextNode, previousNode; //the link to the next node
		
		public Node22(T data, Node22<T> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
		}
		public Node22(T data){
		this.data = data;
		}
		public Node22<T> getPreviousNode() {
			return previousNode;
		}
		public void setPreviousNode(Node22<T> previousNode) {
			this.previousNode = previousNode;
		}
		public T getData() {
		return data;
		}
		public void setData(T data) {
		this.data = data;
		}
		public Node22<T> getNextNode() {
			return nextNode;
		}
		public void setNextNode(Node22<T> nextNode) {
			this.nextNode = nextNode;
			}
		@Override
		public String toString() {
			return data.toString();
		}

}
