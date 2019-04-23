package homework;
//main at mainprojectclass

public class MyGraph22<T extends Number> {
	
	String name;
	int vertices; //number of vertices or nodes to contain in the graph
	T[][] aMatrix; //adjacency matrix
	
	public MyGraph22() {
		this("Graph",1);
	}
	
	public MyGraph22(String string, int vertices) {
		this.name = string;
		this.vertices = vertices;
		aMatrix = (T[][]) new Number[vertices][vertices];
	}
	
	public void addEdge(int source, int destination){
		aMatrix[source][destination] = (T) new Integer (1);
		}
	
	public void removeEdge(int from, int to){
		aMatrix[from][to] = (T) new Integer (0);
		}
	
	@SuppressWarnings("unchecked")
	public void printGraph(){
		System.out.println("\n"+name);
		for(int i = 0; i < aMatrix.length ; i++){
			for(int j = 0; j <= aMatrix[i].length-1 ; j++){
				//print Vertex
				//System.out.printf("edge (%d, %d) = %d \n",i, j, aMatrix[i][j]);
				System.out.println(aMatrix[i][j] != null ? i+ " connected to " +j: i+ " not connected to " +j);
				}
			}
		}
}
