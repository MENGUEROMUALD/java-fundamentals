
public class lesson6 {

	String name;
	int age;
	float heihgt;
	String gender;
	/////with parameter
	public lesson6(String name, int age, float heihgt, String gender) {
		this.name = name;
		this.age = age;
		this.heihgt = heihgt;
		this.gender = gender;
	}
////not parameter
	public lesson6() {
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
	
	
	public static void main(String[] args) {
		System.out.println(" completon le code ");
		lesson6 userOne = new lesson6();
		lesson6 userTwo = new lesson6("Akah",27,65,"Male");
		
		System.out.println("the first user have the information " + userOne.hashCode());
		System.out.println(userTwo.hashCode());
		////or use 
		System.out.println(" -------------------- or use -------------------");
		System.out.println("the second user have the information " + userTwo.getName()+" "+ userTwo.getAge() +" " + userTwo.getHeihgt()+ " " +userTwo.getGender());
		System.out.println(" -------------------- for the second we have -------------------");
		System.out.println("the second user have the information " + userOne.getName()+" "+ userOne.getAge() +" " + userOne.getHeihgt()+ " " +userOne.getGender());

		
	
	}
	
	
}
