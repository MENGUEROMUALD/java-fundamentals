package homework;
import static java.lang.Math.*;
import java.io.*;
import java.util.Scanner;
public class Problems {

	public static void main(String[] args) {
		System.out.println("Import");
	
		Cat myCat;
		myCat = new Cat(2,"White");		//  Object Cat with name myCat. 
		
		Cat myCat1 = new Cat(2,"White"); // another object with name, myCat1.
		
		Cat myCat2 = new Cat(1,"Black"); // third object, myCat2.
		
		System.out.println(myCat1.age);
		System.out.println(myCat2.age);
		
		//System.out.println(myCat.meow); // program executes whatever is in meow method
		
		Cat.sellsCats(); //Since sellsCats is static, this is the code to assess it.
		
		Cat.square(25);
		System.out.println(PI);
		Cat Frank = new Cat();
		
		Scanner Andy = new Scanner(System.in);
		int steps = Andy.nextInt();
		//move(steps, true);
		 
        System.out.println("Cat age: "+myCat.age+", Cat color: "+myCat.getColor());
        System.out.println("Before it is destroyed: "+myCat.toString());     
        //Runtime.getRuntime.gc(); //explicitly invokes the garbage collector to destroy the objects
	}

}
