import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IOhomeWorkExoOne {
	String first;
	String second;
	String third;
	String four;
	String five;
	String destinationOne;
	String destinationTwo;
	String destinationThree;
	String destinationFour;
	String destinationFive;
	public static void main(String[] args) {
		IOhomeWorkExoOne main = new IOhomeWorkExoOne();
		try {
			main.serialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			main.deserialization();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	public void nomUser(String firstname,String secondNAme,String thirdName,String fourthName,String fifthName) {
		destinationOne=firstname+".txt";
		destinationTwo=secondNAme+".txt";
		destinationThree=thirdName+".txt";
		destinationFour=fourthName+".txt";
		destinationFive=fifthName+".txt";
	}
	public void serialize() throws IOException {
		System.out.println("entrer le premier nom ");
		Scanner input=new Scanner(System.in);
		String firstName=input.nextLine();
		System.out.println("entrer le second nom");
		String secondName=input.nextLine();
		System.out.println("entrer le troisieme nom");
		String ThirdName=input.nextLine();
		System.out.println("entrer le quatrieme nom");
		String fourName=input.nextLine();
		System.out.println("entrer le cinquieme nom");
		String fiveName=input.nextLine();
		IOhomeWorkExoOne home= new IOhomeWorkExoOne();
		home.nomUser(firstName, secondName, ThirdName, fourName, fiveName);
		first=firstName;
		second=secondName;
		third=ThirdName;
		four=fourName;
		five=fiveName;
		
		try {
			File firstFile = new File(destinationOne);
			File secondFile = new File(destinationTwo);
			File thirdFile = new File(destinationThree);
			File fourFile = new File(destinationThree);
			File FiveFile = new File(destinationFour);
			if(!firstFile.exists()) {
				firstFile.createNewFile();
				secondFile.createNewFile();
				thirdFile.createNewFile();
				fourFile.createNewFile();
				FiveFile.createNewFile();
				
			}
			System.out.println("before the serialization");
			FileOutputStream fos = new FileOutputStream(firstFile);
			FileOutputStream fos1 = new FileOutputStream(secondFile);
			FileOutputStream fos11 = new FileOutputStream(thirdFile);
			FileOutputStream fos111 = new FileOutputStream(fourFile);
			FileOutputStream fos1111 = new FileOutputStream(FiveFile);
			ObjectOutputStream ous=new ObjectOutputStream(fos);
			ObjectOutputStream ous1=new ObjectOutputStream(fos1);
			ObjectOutputStream ous11=new ObjectOutputStream(fos11);
			ObjectOutputStream ous111=new ObjectOutputStream(fos111);
			ObjectOutputStream ous1111=new ObjectOutputStream(fos1111);
			ous.writeObject(first);
			ous1.writeObject(second);
			ous11.writeObject(third);
			ous111.writeObject(four);
			ous1111.writeObject(five);
			ous.flush();
			ous.close();
			fos.close();
			ous1.flush();
			ous1.close();
			fos1.close();
			ous11.flush();
			ous11.close();
			fos11.close();
			ous1111.flush();
			ous1111.close();
			fos1111.close();
		}catch(FileNotFoundException e) {
			
		}
	}
	public void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(destinationOne);
		FileInputStream fis1 = new FileInputStream(destinationTwo);
		FileInputStream fis11 = new FileInputStream(destinationThree);
		FileInputStream fis111 = new FileInputStream(destinationFour);
		FileInputStream fis1111 = new FileInputStream(destinationFive);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		ObjectInputStream ois11 = new ObjectInputStream(fis11);
		ObjectInputStream ois111 = new ObjectInputStream(fis111);
		ObjectInputStream ois1111 = new ObjectInputStream(fis1111);
		IOhomeWorkExoOne name = (IOhomeWorkExoOne) ois.readObject();
		IOhomeWorkExoOne name1 = (IOhomeWorkExoOne) ois1.readObject();
		IOhomeWorkExoOne name11 = (IOhomeWorkExoOne) ois11.readObject();
		IOhomeWorkExoOne name111 = (IOhomeWorkExoOne) ois111.readObject();
		IOhomeWorkExoOne name1111 = (IOhomeWorkExoOne) ois1111.readObject();
		System.out.println("voila vos noms");
		System.out.println(name.toString());
		ois.close();
		fis.close();
		ois1.close();
		fis1.close();
		ois11.close();
		fis11.close();
		ois111.close();
		fis111.close();
		ois1111.close();
		fis1111.close();
		
	}
	}


