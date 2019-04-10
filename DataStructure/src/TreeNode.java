
public class TreeNode<T extends Comparable<T>> {
	T data;
	TreeNode<T> leftNode;
	TreeNode<T> rigthNode;
	
	public TreeNode(T data) {
	this.data = data;
	leftNode = rigthNode = null;
	
	}
	
	public T getData() {
		
	return data;
	
	}
	
	public void setData(T data) {
		
	this.data = data; 
	
	}
	public void setLeftNode(TreeNode<T> node) {
		
		if(leftNode == null){
			leftNode = node;
		System.out.println("Set to Left Node : "+node.getData());
		return; 
	}
		else if(leftNode.data.compareTo(node.data) > 0)
			getLeftNode().setLeftNode(node); 
		else
			getLeftNode().setRightNode(node);
		}
	
	public void setRightNode(TreeNode<T> node) {
		if(rigthNode == null){
			rigthNode = node;
		System.out.println("Set to Right Node : "+node.getData());
		return; 
		}
		else if(rigthNode.data.compareTo(node.data) > 0)
		getRigthNode().setLeftNode(node); 
		else
			getRigthNode().setRightNode(node);
		}

	public TreeNode<T> getRigthNode() {
		return rigthNode;
	}

	public TreeNode<T> getLeftNode() {
		return leftNode;
	}
	
	
}
		
		 
