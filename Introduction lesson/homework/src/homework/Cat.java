package homework;

public class Cat {
	private int legs;                // difference using private and public Vs without???
	private String color;
	int age;       // state = member/instance variables
	public static int catCount; //class variable(static) 				FIELDS
	
	public void meow() {}
	public void skip() { int steps = 3;   // Local variable/STATIC= can be invoked without creating an object of the class???
	}		// void= return type(double)= doesn't return a value but only carryout its task and terminates.
	public void eat() {}    // behavior									METHODS
	
	public Cat() {       //constructor(identified by class name)
		this.age = 3; this.color = "White"; this.legs = 4;	//			CONSTRUCTOR
	}
	
	// constructor with one parameter			CONSTRUCTORS ARE
	// public Cat(int age){this.age = age}		SPECIAL METHODS TO INITIALIZE A CLASS
	// public Cat(){}  // constructor without any parameter
	// There can be more than 1 constructor in a class and they can have any number of parameters.
	
	public Cat(int age, String color) {
		this.age = age;
		this.color = color;
		System.out.println("New cat.Color : "+color);
	}
		
	public static void sellsCats() {
		
		
	}
	public String getColor() { //this method allows initializing private color instance variable.
		return color;
	}
	public static void square(int a) {
		double sq = Math.sqrt(a);
		System.out.println(sq);
	}
	public void move(int steps, boolean direction) {
		
	}
	
	@Override       
	protected void finalize(){      
		System.out.println("Destroying .................... ");
	}
}
