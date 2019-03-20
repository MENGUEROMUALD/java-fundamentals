import java.io.IOException;
import java.util.Scanner;

public class QuiVeuxDesMillions {

	public static void main(String[] args) {
		Question question = new Question();
		question.question();
		try {
			question.serialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			question.deserialization();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i =0;
		while(i==1) {
			question.question();
			Scanner	 input=new Scanner(System.in);
			System.out.println("voullez vour rejouer ?");
			i=input.nextInt();
		}

	}

}
