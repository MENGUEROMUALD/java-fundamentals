package homework;

public class InheritanceDerived extends Inheritance13 {
	
		InheritanceDerived(String name, int age) {
		super(name, age); //calls the base class' constructor that takes a string
		}
		InheritanceDerived(){ //empty constructor
		}
		public void greeting(String name){
		System.out.printf("Hi! I am %s, and I am %d years old", this.name, age);
		System.out.printf("\nI was born on %s", birthDay);
		}
		public static void main(String[] args){
			InheritanceDerived derived = new InheritanceDerived("Emily", 25);
			derived.greeting("");
			//super.introduce(); invokes the introduce method from base class	
		
		Inheritance13 can = new Inheritance13();
		boolean isInheritance13 = can instanceof Inheritance13;
		System.out.println("Is Inheritance13 the parent this class ? "+isInheritance13);
		}
}
