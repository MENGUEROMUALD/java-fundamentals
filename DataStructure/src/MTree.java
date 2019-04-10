
public class MTree <T  extends Comparable<T>>{
	String treeLabel; 
	TreeNode<T> rootNode;
	
	public MTree() {
		
	this("Sample Tree");
	}
	public MTree(String label) { 
		treeLabel = label;
	rootNode = null; 
	}
}
