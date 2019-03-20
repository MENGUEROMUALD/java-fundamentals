package org.toubou.Lesson20;

import org.toubou.Shape;
import org.toubou.Lesson20.TwoDimensionalShape;
import org.toubou.Lesson20.Toy;
import org.toubou.Lesson20.MyStack;

public class ExamplesLesson20 {

	public static void main(String[] args) {
		//Shape sh=new Shape("Square",4);
		//Toy toy =new Toy(sh);
		//TwoDimensionalShape.getDimension(toy);
		//TwoDimensionalShape.getDimension(sh);
         MyStack<Integer> stack =new MyStack<Integer>(20);
         stack.push(10);
         stack.push(2);
         stack.push(15);
         stack.push(111);
         try {
			stack.pop();
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
         stack.display();
         
         System.out.println();
         
         MyStack<String> stack1 =new MyStack<String>(20);
         stack1.push("Banane");
         stack1.push("Papaye");
         stack1.push("Ananas");
         stack1.push("Orange");
         try {
        	 stack1.pop();
		} catch (StackEmptyException e) {
			e.printStackTrace();
		}
         stack1.display();

	}

}
