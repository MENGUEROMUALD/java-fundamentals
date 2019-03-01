
public class User {
	static String name;
	static int age;
	static String diplome;
	
	public User(String name, int age, String diplome) {
		super();
		this.name = name;
		this.age = age;
		this.diplome = diplome;
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
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

}
