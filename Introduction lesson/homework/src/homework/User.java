package homework;

public class User {
	String name;
	int age;
	float height;
	String gender;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public User() {
		
	}
	public User(String name, int age, float height, String gender) {//constructor
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		
		

	}

}
