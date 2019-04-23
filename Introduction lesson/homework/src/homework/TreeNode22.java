package homework;
//main at mainprojectclass

public class TreeNode22<T extends Comparable<T>> {
	
	T data;
	TreeNode22<T> leftNode;
	TreeNode22<T> rightNode;
	
	public TreeNode22(T data) {
		this.data = data;
	leftNode = rightNode = null;
	}
	
	public T getData() {
	return data;
	}
	
	public void setData(T data) {
	this.data = data;
	}
	
	public void setLeftNode(TreeNode22<T> node) {
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
	
	TreeNode22<T> getLeftNode() {
		return leftNode;
	}
	
	public void setRightNode(TreeNode22<T> node) {
		if(rightNode == null){
			rightNode = node;
			System.out.println("Set to Right Node : "+node.getData());
		return;
		}
		else if(rightNode.data.compareTo(node.data) > 0)
			getRightNode().setLeftNode(node);
		else
			getRightNode().setRightNode(node);
	}
	
	TreeNode22<T> getRightNode() {
		return rightNode;
	}
}
