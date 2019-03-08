package homework;

public abstract class Anonymous15 {
	
		public abstract void method(String … args); 
		}		
		
		public static void main(String[] args){
			
			Anonymous15 anon = new Anonymous15Class(){
		@Override
		public void method(String … args){
		System.out.println("Hello! Welcome inside!");
		}
		};
		anon.method();
}


