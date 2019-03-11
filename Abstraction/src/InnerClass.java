
public class InnerClass {
	
	private class B {
		
		public void sayHi() {
			System.out.println("konichi wa");
		}
		
		
	}
	public void say() {
		new B().sayHi();
	}
	public static void main(String[] args) {
		InnerClass o=new InnerClass();
		o.say();
		o.sayHiiiii();

	}
	
	public void sayHiiiii() {
		class DedansClass{
			private String name ="Seven Academy";
			String hello() {
				System.out.println("hello "+name);
				return name;
			}
		}
		DedansClass dedans= new DedansClass();
		dedans.hello();
	}
	///////////////// or if i dou
	/* private class C {
		public void sayHi() {
			System.out.println("konichi wa");
		}
		new C.sayHi();
	}
	public static void main(String[] args) {
		InnerClass innerclass = new InnerClass();
		innerclass.sayHi();

	}*/

}
