
public class User {
	String name;
	int age;
	float heihgt;
	String gender;
	/////with parameter
	public User(String name, int age, float heihgt, String gender) {
		this.name = name;
		this.age = age;
		this.heihgt = heihgt;
		this.gender = gender;
	}
////not parameter
	public User() {
		this.name = "kenfack";
		this.age = 21;
		this.heihgt = 65;
		this.gender = "Male";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeihgt() {
		return heihgt;
	}
	public void setHeihgt(float heihgt) {
		this.heihgt = heihgt;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
