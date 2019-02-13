package homework;

public class Fruit {// 2 fields texture and color. create 2 constructor, 
	//one empty and one that passes values of the parameters.
	// create methods that sets each field and return each field.

	float texture;
	String color;
	
	public Fruit () {	
	}
	public Fruit (float texture, String color) {
		this.texture = texture;
		this.color = color;
	}
	public void setTexture(float texture) {
		this.texture = texture;
	}
	public float getTexture() {
		return texture;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public static void sayHello(){
		System.out.println("Hello");
	}
	public static void hi(int a, int b){
		int hello = a + b; 
		System.out.println(hello);
	}
	public static void cuz(int a, float b) {
		double c = a + b;
		System.out.println(c);
	}

	public static void square (int a) {
		double sq = Math.sqrt(a);
		System.out.println("The square root is : "+sq);
	}
	public void move(int steps, boolean direction){
		
	}
	public static int squa(int a){
		System.out.println("Number before square is : "+a);
		a = a*a;
		System.out.println("Number after square is : "+a);
		return a;
		}
	 
}
