package homework;
import static java.lang.Math.*;

import java.util.Collection;
import java.util.LinkedList;

public class mainprojectclass {

	public static void main(String[] args) throws Exception {
		/*
		 * Vehicle mercedes = new Vehicle();// object class. imports the vehicle file
		 * and assigns mercedes.
		 * 
		 * System.out.println(mercedes.color); mercedes.changecolor("yellow");
		 * mercedes.getcolor();
		 * 
		 * System.out.println("Square root of 64 is : "+sqrt(64));//imports from default
		 * maths class. System.out.println("PI is : "+PI);
		 * 
		 * User man = new User(); // object class (new) man.setName("Andy");
		 * man.setAge(26); man.setHeight(160); man.setGender("Male");
		 * 
		 * System.out.println(man.getName()+" "+man.getAge()+" "+man.getHeight()+" "+man
		 * .getGender()); User boy = man;
		 * 
		 * User girl = new User(); girl.setName("fred");
		 * System.out.println(girl.getName()); girl.setAge(26); girl.setHeight(160);
		 * girl.setGender("Male");
		 * 
		 * System.out.println("Information : "+man.equals(boy));
		 * System.out.println("Information : "+man.equals(girl));
		 * System.out.println("Hashcode = "+man.hashCode());
		 * System.out.println("Hashcode = "+girl.hashCode());
		 * System.out.println("Equals : "+man.toString());
		 * 
		 * System.out.println("Before it is destroyed: "+man.toString());
		 * //Runtime.getRuntime.gc(); //explicitly invokes the garbage collector to
		 * destroy the objects
		 * 
		 * Lesson7 square= new Lesson7();// creating object of lesson7
		 * //square.square(64); // calling the method in lesson7
		 */
		
		
		/*
		 * SalariedEmployee empl1 = new SalariedEmployee(" Uduma "," Andy ", 1234, 31 ,
		 * true, 5000); System.out.println(empl1); System.out.println("");
		 * 
		 * HourlyEmployee empl2 = new HourlyEmployee(" Uduma ", " Mokonchu ", 1234, 32,
		 * true, 12.45, 40); System.out.println(empl2); System.out.println("");
		 * 
		 * 
		 * BasePlusComissionEmployee empl3 = new
		 * BasePlusComissionEmployee(" Uduma "," Andreas ", 1234, 33, true, 50, 2000);
		 * System.out.println(empl3);
		 * 
		 * ComissionEmployee empl4 = new ComissionEmployee(" Uduma "," Emilia ", 1234,
		 * 27, true, 200, 1.5, 900); System.out.println(empl4);
		 */
		
		  SinglyLinkedList22<String> list = new SinglyLinkedList22("My first list");
		  list.insert(new Node22<String>("First")); 
		  list.insert(new Node22<String>("Second")); 
		  list.insert(new Node22<String>("Third"));
		  
		  //list.printList();
		  
		  //list.remove(); list.printList();
		  
		  // list.remove(); list.printList(); System.out.println("");
		  // list.remove(); list.printList(); System.out.println("");
		  // list.remove(); list.printList(); System.out.println("");
		  
		  // Doubly linked list
		  
		  DoublyLInkedList22<String> dl = new DoublyLInkedList22(); 
		  dl.insertFront(new Node22<String>("First double")); 
		  dl.insertFront(new Node22<String>("second double")); 
		  dl.insertFront(new Node22<String>("third double"));
		  dl.insertBack(new Node22<String>("last double"));
		 
		  
		 // dl.printFromnext(); dl.printFromprev();
		 // System.out.println("");
		  
		  //dl.removeFront();dl.printFromnext();dl.printFromprev();
		  //dl.removeBack();dl.printFromnext();dl.printFromprev();
		 // System.out.println("");
		  
		  Stack22<String> st = new Stack22<>("My Stack");
		  st.push(new Node22<String>("Uduma"));
		  st.push(new Node22<String>("Andreas"));
		  st.push(new Node22<String>("Mokonchu"));
		  st.push(new Node22<String>("USA"));
		 
		 /* st.print();
		  System.out.println(" ");
		  st.pop();st.print();
		  st.pop();st.print();
		  System.out.println("");
		  */
		  //Queue

		  Queue22 q = new Queue22("Queue one");
		  q.enqueue(new Node22<String>("First Queue"));
		  q.enqueue(new Node22<String>("Second Queue"));
		  q.enqueue(new Node22<String>("third Queue"));
		  
		 /* q.print();
		  System.out.println("");
		  
		  q.dequeue();
		  q.print();
		  System.out.println("");
		  */
		  
		  MTree22<Integer> myTree = new MTree22<Integer>("Integer Tree");
		  myTree.insert(new TreeNode22<Integer>(100));
		  myTree.insert(new TreeNode22<>(new Integer(12)));
		  myTree.insert(new TreeNode22<>(new Integer(123)));
		  myTree.insert(new TreeNode22<>(new Integer(52)));
		  myTree.insert(new TreeNode22<>(new Integer(10)));
		  myTree.insert(new TreeNode22<>(new Integer(112)));
		  myTree.insert(new TreeNode22<>(new Integer(252)));
		  myTree.printTree();
		  System.out.println("");
		  
		  Tree<Integer> tree = new Tree<Integer>("uduma's Tree");
		  tree.insert(new TreeNode<Integer>(10));
		  tree.insert(new TreeNode<>(new Integer(12)));
		  tree.insert(new TreeNode<>(new Integer(45)));
		  tree.insert(new TreeNode<>(new Integer(52)));
		  tree.insert(new TreeNode<>(new Integer(11)));
		  tree.insert(new TreeNode<>(new Integer(154)));
		  tree.insert(new TreeNode<>(new Integer(280)));
		  tree.printTree();
		  System.out.println("");
		
		  /*MyGraph22<Integer> graph = new MyGraph22<>("Graph",3);// prints wrong values even when connected
		  graph.addEdge(0,1);
		  graph.addEdge(1,2);
		  graph.addEdge(0,2);
		  graph.addEdge(1,0);
		  graph.addEdge(2,1);
		  graph.addEdge(2,0);
		  graph.printGraph();*/
		  
		  //ExerciseDataS e = new ExerciseDataS();
		  
		  /*SinglyLinkedList22<Integer> list1 = new SinglyLinkedList22("My Exercise");
		  list1.insert(new Node22<Integer>(e.random())); 
		  list1.insert(new Node22<Integer>(e.random())); 
		  list1.insert(new Node22<Integer>(e.random()));
		  list1.insert(new Node22<Integer>(e.random())); 
		  list1.insert(new Node22<Integer>(e.random()));
		  //Collection.sort(list1);
		  
		  list1.printList();*/
		  
		 /* MTree22<Integer> myTree1 = new MTree22<Integer>("Integer Tree");
		  myTree1.insert(new TreeNode22<Integer>(e.random()));
		  myTree1.insert(new TreeNode22<>(new Integer(e.random())));
		  myTree1.insert(new TreeNode22<>(new Integer(e.random())));
		  myTree1.insert(new TreeNode22<>(new Integer(e.random())));
		  myTree1.insert(new TreeNode22<>(new Integer(e.random())));
		  myTree1.insert(new TreeNode22<>(new Integer(e.random())));
		  myTree1.insert(new TreeNode22<>(new Integer(e.random())));
		  myTree1.printTree();
		  System.out.println("");*/
	}
}
