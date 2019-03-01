
public class Student extends User{
	
	public static void main(String[] args) {
		
	afficher();
		
	}
	
	public Student(String name, int age, String diplome) {
		super("mr ndeme", 24, "bachelor");
		// TODO Auto-generated constructor stub
	}
	public static void afficher(){
		Student student = new Student("mr ndeme", 24, "bac");
		System.out.println("Hello my name is "+student.getName() + "i am a student i have " +student.getAge()+ "and i have my "+student.getDiplome());
		System.out.println(student instanceof User);
	}
	

}
