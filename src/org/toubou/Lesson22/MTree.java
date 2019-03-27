package org.toubou.Lesson22;

public class MTree<T extends Comparable<T>> {
	
	String treeLabel;
	TreeNode<T> rootNode;
	public MTree() {
		this("Sample Tree");
	}
	public MTree(String treeLabel) {
		this.treeLabel = treeLabel;
		rootNode=null;
	}
	
	public void insert(TreeNode<T> node){

		if(rootNode == null){
			rootNode = node;
			return;
		}

		if(rootNode.getData().compareTo(node.getData()) > 0)
			rootNode.setLeftNode(node);
		else
			rootNode.setRightNode(node);
		}
	
	public void preOrder(TreeNode<T> node){

		if(node == null)
			return;
		System.out.printf("\t %s", node.data);

		preOrder(node.getLeftNode());
		preOrder(node.getRightNode());
	}
	
	public void inOrder(TreeNode<T> node){

		if(node == null)
			return;

		inOrder(node.getLeftNode());
		System.out.printf("\t %s", node.data);
		inOrder(node.getRightNode());
	}
	
	public void postOrder(TreeNode<T> node){

		if(node == null)
			return;

		postOrder(node.getLeftNode());
		postOrder(node.getRightNode());
		System.out.printf("\t %s", node.data);

	}
	
	public void printTree(){
		System.out.println(treeLabel+" -> Preorder Traversal");

		preOrder(rootNode);
		System.out.println("\n"+treeLabel+" -> Inorder Traversal");

		inOrder(rootNode);
		System.out.println("\n"+treeLabel+" -> Postorder Traversal");

		postOrder(rootNode);

	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// Primary method used to test other classes

		MTree<Integer> myTree = new MTree<Integer>("Integer Tree");

		myTree.insert(new TreeNode<Integer>(100));

		myTree.insert(new TreeNode<>(new Integer(12)));

		myTree.insert(new TreeNode<>(new Integer(123)));

		myTree.insert(new TreeNode<>(new Integer(52)));
		
		myTree.insert(new TreeNode<>(new Integer(10)));
		myTree.insert(new TreeNode<>(new Integer(252)));
		myTree.insert(new TreeNode<>(new Integer(112)));

		myTree.printTree();

		}

}
