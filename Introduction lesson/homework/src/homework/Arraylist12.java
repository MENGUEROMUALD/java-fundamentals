package homework;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class

public class Arraylist12 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    System.out.println(cars.get(0));
		
	    cars.set(0, "Opel");
	    System.out.println(cars);
	    
	    cars.remove(0);
	    System.out.println(cars);
	    
	    System.out.println(cars.size());
	    
	    cars.clear();
	    System.out.println(cars);
	    
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars.get(i));
	    }
	    for (String i : cars) {
	        System.out.println(i);
	      }
	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    
	    Collections.sort(cars);  // Sort cars

	    for (String i : cars) {
	      System.out.println(i);
	    }
	    
	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }

	}

}
