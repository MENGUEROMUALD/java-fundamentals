
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User userOne = new User();
		User userTwo = new User("Akah",27,65,"Male");
		
		System.out.println("the first user have the information " + userOne.hashCode());
		System.out.println(userTwo.hashCode());
		////or use 
		System.out.println(" -------------------- or use -------------------");
		System.out.println("the second user have the information " + userTwo.getName()+" "+ userTwo.getAge() +" " + userTwo.getHeihgt()+ " " +userTwo.getGender());
		System.out.println(" -------------------- for the second we have -------------------");
		System.out.println("the second user have the information " + userOne.getName()+" "+ userOne.getAge() +" " + userOne.getHeihgt()+ " " +userOne.getGender());

	}

}
