import java.io.IOException;
import java.util.Scanner;

public class FiveNameFile  {
	
	public static void main (String[] args ) {
		System.out.println("enter your name");
		Scanner input =new Scanner(System.in);
		String name =input.nextLine();
		System.out.println("the second name please ");
		String secondName=input.nextLine();
		System.out.println("le troisieme");
		String thirdName=input.nextLine();
		System.out.println("le quatrieme nom svp");
		String fourName=input.nextLine();
		System.out.println("le dernier nom svp");
		String fiveName=input.nextLine();
		FileSerializer file = new FileSerializer();
		
		try {
			file.serialize(name, secondName, thirdName, fourName, fiveName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			file.deserialization();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
