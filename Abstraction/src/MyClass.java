
public class MyClass {
	static class StaticNested{
		public void sayHi() {
			System.out.println("hi you are in the static nested class");
		}
	}

	public static void main(String[] args) {
		MyClass.StaticNested nested = new MyClass.StaticNested();
		nested.sayHi();
	}

}
