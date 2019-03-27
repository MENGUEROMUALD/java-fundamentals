package org.toubou.Lesson22;

public class TreeNode<T extends Comparable<T>>{
	
	T data;
	TreeNode<T> leftNode;
	TreeNode<T> rightNode;
	public TreeNode(T data) {
		this.data = data;
		leftNode=rightNode=null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public void setLeftNode(TreeNode<T> node) {
		if(leftNode==null) {
			leftNode=node;
			System.out.println("Set to left Node: " +node.getData());
			return;
		}
		else if(leftNode.data.compareTo(node.data)>0)
			  getLeftNode().setLeftNode(node);
		else 
			getLeftNode().setRightNode(node);
	}
	public TreeNode<T> getLeftNode() {
		return leftNode;
	}
	public TreeNode<T> getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode<T> node) {
		if(rightNode==null) {
			rightNode=node;
			System.out.println("Set to Right Node: " +node.getData());
			return;
		}
		else if(rightNode.data.compareTo(node.data)>0)
			getRightNode().setLeftNode(node);
		else 
			getRightNode().setRightNode(node);
	}
	
	
	
}
