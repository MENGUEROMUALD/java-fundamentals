package homework;

public class Main15 {

	public static void main(String[] args) {
		
		/*
		 * InnerClasses15 aClass = new InnerClasses15(); aClass.call();
		 */

		/*
		 * InnerClasses15 in = new InnerClasses15(); in.inn();
		 */
		
		/*
		 * InnerClasses15 in = new InnerClasses15(); in.sayHello();
		 */
		Square sq = new Square("square",5,5);
		Toy20 toy = new Toy20(sq);
		
		Main15 main = new Main15();
		main.getDimension(toy);
		
		Stack20 st = new Stack20(0);
		st.push("Jon");
		st.printStack();
		
		
		
	}
	
	
	public  <T extends Toy20<T>>T  getDimension(T data){
		System.out.println(data.getData());
		return data;
	}

}
