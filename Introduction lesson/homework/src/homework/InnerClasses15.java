package homework;

public class InnerClasses15 {
	
	/*
	 * static class StaticNested{ //static class
	 * 
	 * public void sayHi(){
	 * System.out.println("Hi!. You are in the static nested class"); } } public
	 * static void main(String[] args){ //notice the particular style of
	 * instantiating the static nested class
	 * 
	 * InnerClasses15.StaticNested nested = new InnerClasses15.StaticNested();
	 * nested.sayHi(); }
	 */

	/*
	 * private class B {// non static class
	 * 
	 * public void sayHi(){ System.out.println("Konichi wa"); } } public void call()
	 * { new B().sayHi(); }
	 */
	
	/*
	 * private class InnerClass{ private String name = "Seven Academy";
	 * 
	 * String greet(){ System.out.print("Hello "); return name; }
	 * 
	 * } public void inn() { new InnerClass().greet(); }
	 */
	
	/*
	 * public void sayHello(){
	 * 
	 * class InnerClass{
	 * 
	 * private String name = "Seven Academy";
	 * 
	 * String hello(){ System.out.print("Hello "); return name; } } InnerClass
	 * innerc = new InnerClass(); innerc.hello(); }
	 */
	
	public static void main(String[] args){
		
		InnerClasses15 obj = new InnerClasses15();
		obj.start( new Anonymous15(){
			
		@Override
		public void method(String _ args){
		System.out.println("Hello! Welcome inside!");
		}
});
	}
		public void start(Anonymous15 a){
		a.method();
		}
}
	
