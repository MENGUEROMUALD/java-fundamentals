
public class MyGraph  <T  extends Number>{
	String name;
	int vertices;
	T[][] aMatrix;
	public MyGraph() {
		this("Graph",1);
	}
	public MyGraph(String name, int vertices) {
		super();
		this.name = name;
		this.vertices = vertices;
		this.aMatrix = (T[][])new Number[vertices][vertices];
	}
	
	
	public void addEdge(int source,int destination) {
		aMatrix[source][destination]=(T)new Integer(1);
		
	}
	public void removeEdge(int from,int to) {
		aMatrix[from][to]=(T)new Integer(0);
	}
	public void printGraph() {
		for(int i=0;i<aMatrix.length;i++) {
			for(int j=0;j<aMatrix[i].length;j++) {
				System.out.println(aMatrix[i][j]==(T)new Integer(1)? i +" connect to " + j: i+" not connected to " +j);
			}
		}
	}
	

}
