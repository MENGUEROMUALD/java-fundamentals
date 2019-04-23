package homework;
//main at mainprojectclass
public class Tree<T extends Comparable<T>>{
	
	String treelabel;
	TreeNode<T> rootnode;
	
	public Tree() {
		this("Tree1");
	}
	public Tree(String label) {
		this.treelabel = label;
		rootnode = null;
	}
	public void insert(TreeNode<T> node) {
		if(rootnode == null) {
			rootnode = node;
		System.out.println("Rootnode : "+rootnode.getData());
		return;
		}
		if(rootnode.getData().compareTo(node.getData()) > 0)
			rootnode.setLeftnode(node);
		else
			rootnode.setRightnode(node);
	}
	public void preOrder(TreeNode<T> node) {
		if(node == null)
			return;
		System.out.printf("\t %s", node.getData());
		preOrder(node.getLeftnode());
		preOrder(node.getRightnode());	
	}
	public void inOrder(TreeNode<T> node) {
		if(node == null)
			return;
		
		inOrder(node.getLeftnode());
		System.out.printf("\t %s", node.getData());
		inOrder(node.getRightnode());	
	}
	public void postOrder(TreeNode<T> node) {
		if(node == null)
			return;
		
		postOrder(node.getLeftnode());
		postOrder(node.getRightnode());	
		System.out.printf("\t %s", node.getData());
	}
	public void printTree() {
		System.out.println(treelabel+" --> preorder ");
		preOrder(rootnode);
		
		System.out.println("\n"+treelabel+" --> inorder ");
		inOrder(rootnode);
		
		System.out.println("\n"+treelabel+" --> postorder ");
		postOrder(rootnode);
	}

}
