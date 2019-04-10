import java.awt.List;
import java.util.ArrayList;

public class MainDataStructure {

	public static void main(String[] args) {
		DoubleLinkList liste=new DoubleLinkList();
		MySinglyLinkedList<String> list =new MySinglyLinkedList<String>("list des noms");
		DoubleLinkList<String> listTwo =new DoubleLinkList<String>("liste nvlle");
		
		/*listTwo.insertFront(new DoubleNode("kenfack",null,null));
		listTwo.insertFront(new DoubleNode("mollah",null,null));
		listTwo.printListHead();*/
		/*Queue<String> que = new Queue<String>();
		que.endqueue(new DoubleNode("kenfack"));
		que.endqueue(new DoubleNode("leon"));
		que.endqueue(new DoubleNode("akah"));
		que.endqueue(new DoubleNode("atanga"));
		que.print();
		que.printListHead();*/
		/**
		 * @author sevenacademy
		 * @see
		 * @return
		 * @param
		 */
		MyGraph graph= new MyGraph("ma matrice",5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 0);
		graph.addEdge(0, 3);
		graph.printGraph();
	}
	

}
