package homework;

public class Vehicle {
	public int doors;
	public int speed;
	public String color="red";
	
	public void run() {
		
	}
	public Vehicle() {
		//this.color=color;
	}
	public void getcolor() {
		System.out.println(color);
	}
	public void changecolor(String colors) {
		this.color=colors;
	}
	
}