package homework;
//main at mainprojectclass

public class MTree22 <T extends Comparable<T>>{
	
	String treeLabel;
	TreeNode22<T> rootNode;
	
	public MTree22() {
	this("Sample Tree");
	}
	
	public MTree22(String label) {
	treeLabel = label;
	rootNode = null;
	}

	public void insert(TreeNode22<T> node){
		if(rootNode == null){
			rootNode = node;
			System.out.println("Rootnode : "+rootNode.getData());
		return;
		}
		if(rootNode.getData().compareTo(node.getData()) > 0)
			rootNode.setLeftNode(node);
		else
			rootNode.setRightNode(node);
	}
	
	public void preOrder(TreeNode22<T> node){
		if(node == null)
			return;
		System.out.printf("\t %s", node.data);
		
		preOrder(node.getLeftNode());
		preOrder(node.getRightNode());
		}
	
	public void inOrder(TreeNode22<T> node){
		if(node == null)
			return;
		inOrder(node.getLeftNode());
		System.out.printf("\t %s", node.data);
		inOrder(node.getRightNode());
		}
	
	public void postOrder(TreeNode22<T> node){
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
	
	
}
