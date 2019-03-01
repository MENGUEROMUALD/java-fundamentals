
public class Teacher extends User {
	public static void main(String[] args) {
		
		afficher();
			
		}

	public Teacher(String name, int i, String diplome) {
		super("Mr Akah", 26, "Master");
	
	}	
	public static void afficher(){
		Teacher teacher= new Teacher("Mr Akah", 26, "Master");
		System.out.println("Hello my name is "+teacher.getName() + "i am a student i have " +teacher.getAge()+ "and i have my "+teacher.getDiplome());
	}
}
