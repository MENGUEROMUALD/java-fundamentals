import java.util.Stack;

public class TowerOfHanoi {
	 
	private int moves;
	
	public void moveDisk(int n, String from,String to, String temp){
		
	if(n == 1){
	moves++; 
	System.out.printf("\nMove: %s --> %s\n", from, to); 
	
	}
	else{
	moveDisk(n-1, from, temp, to); moveDisk(1, from, to, temp); moveDisk(n-1, temp, to, from);
	
		} 
	
	}
	
	public void start(){
		Stack source = new Stack();
		moveDisk(source.size(), "Source Peg", "Temporal Peg", "Destination Peg");
		System.out.println("Total Moves: "+moves); }
	 

}
