package homework;

public class Inheritance13 {
	
	String name;
	int age;
	protected String birthDay;
	
	public Inheritance13(String name, int age){
	this.name = name;
	this.age = age;
	System.out.printf("Welcome %s. How old are you?\n", name);
	}
	public Inheritance13(){
	System.out.println("\nWelcome to inheritance!");
	}
	public void introduce(){
	System.out.printf("Hello, I am the InheritanceClass. Are you %d years old?", age);
	}
	public static void main(String[] args) {
		
		//demonstrating inheritance
		Inheritance13 myclass = new Inheritance13("Andy", 30);
		myclass.introduce();
		new Inheritance13();
		
	}
}
