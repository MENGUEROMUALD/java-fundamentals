package homework;
//main at mainprojectclass
public class TreeNode<T extends Comparable<T>> {
	
	T data;
	TreeNode<T> leftnode;
	TreeNode<T> rightnode;
	
	public TreeNode(T data) {
		this.data = data;
		leftnode = rightnode = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public TreeNode<T> getLeftnode() {
		return leftnode;
	}

	public void setLeftnode(TreeNode<T> node) {
		if(leftnode == null) {
			leftnode = node;
			System.out.println("Set to leftnode : "+node.getData());
			return;
		}
		else if(leftnode.data.compareTo(node.data) > 0) {
			getLeftnode().setLeftnode(node);
		}
		else {
			getLeftnode().setRightnode(node);
		}
	}

	public TreeNode<T> getRightnode() {
		return rightnode;
	}

	public void setRightnode(TreeNode<T> node) {
		if(rightnode == null) {
			rightnode = node;
			System.out.println("Set to righttnode : "+node.getData());
			return;
		}
		else if(rightnode.data.compareTo(node.data) > 0) {
			getRightnode().setLeftnode(node);
		}
		else {
			getRightnode().setRightnode(node);
		}
	}
	
	
	
}
