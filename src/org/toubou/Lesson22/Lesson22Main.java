package org.toubou.Lesson22;

public class Lesson22Main {
	public static void main(String[] args) {
		MySinglyLinkedList<String> linkList=new MySinglyLinkedList<String>("Names");
		linkList.insert(new Node<String>("Jean",null));
		linkList.insert(new Node<String>("Sylvain",null));
		linkList.insert(new Node<String>("TOUBOU",null));
		System.out.println(linkList.toString());
		linkList.printList();
		linkList.remove();
		System.out.println("------------After remove---------------");
		System.out.println(linkList.toString());
		linkList.printList();
		
		System.out.println("------------Double List---------------");
		MyDoubleLinkedList<String> dList=new MyDoubleLinkedList<String>("Contacts");
		dList.insertFront(new Node<String>("DFirst"));
		dList.insertFront(new Node<String>("DSecond"));
		/*try {
			dList.removeBack();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		dList.insertFront(new Node<String>("DThird"));
		dList.insertFront(new Node<String>("DFour"));
		System.out.println(dList.toString());
		dList.printFrontHead();
		dList.printFrontTail();
		
		System.out.println("------------Stack---------------");
		Stack22<Integer> st=new Stack22<Integer>("PileNombre");
		st.insert(1);
		st.insert(2);
		st.insert(8);
		st.insert(3);
		st.insert(7);
		st.insert(4);
		st.insert(6);
		st.display();
		System.out.println("------------Stack after remove---------------");
		try {
			st.remove();
		} catch (Exception e) {
			e.printStackTrace();
		}
		st.display();
		System.out.println("------------Queue---------------");
		Queues<Integer> queu=new Queues<Integer>();
		queu.enqueues(new Node<Integer>(1));
		queu.enqueues(new Node<Integer>(2));
		queu.enqueues(new Node<Integer>(3));
		queu.enqueues(new Node<Integer>(4));
		queu.enqueues(new Node<Integer>(5));
		queu.print();
		System.out.println("------------Queue after dequeue---------------");
		
		queu.dequeues();
		queu.print();
		
	}
}
