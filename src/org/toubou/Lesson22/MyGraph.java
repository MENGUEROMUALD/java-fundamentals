package org.toubou.Lesson22;
/**
 * 
 * @author jeansylvain.toubou
 *
 * @param <T>
 * 
 * @version 1.0
 * 
 * @since 27.03.2019
 * 
 * 
 */
public class MyGraph<T extends Number> {
	String name;
	int vertices;//number of vertices or nodes to contain in the graph
	T[][] aMatrix;
	
	public MyGraph() {
		this("Graph",1);
	}

	public MyGraph(String name, int vertice) {
		this.name = name;
		this.vertices = vertice;
		aMatrix=(T[][]) new Number[vertice][vertice];
	}
	
	public void addEdge(int source, int destination){
		aMatrix[source][destination] = (T) new Integer(1);
	}

	public void removeEdge(int from, int to){
		aMatrix[from][to] = (T) new Integer(0);
	}
	
	public void printGraph(){

		System.out.println("\n"+name);

		for(int i = 0; i < aMatrix.length ; i++){
			for(int j = 0; j <= aMatrix[i].length-1 ; j++){
				//print Vertex
				System.out.printf("edge (%d, %d) = %d \n",i, j, aMatrix[i][j]);
			}
		}

	}
}
