
public class Cat {
	
	
	String color;
	int age;
	
	public Cat(int age , String color) {
		this.age =3;
		this.color="white";
		System.out.println(" new cat>colo" + color);
	}
	
	Cat mycat = new Cat(2,"Black");

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
