import java.util.Scanner;

public class WhoWantTobeBillionnaireMain {

	public static void main(String[] args) {
		Question question = new Question();
		int i =0;
		while(i==1) {
			question.question();
			Scanner	 input=new Scanner(System.in);
			System.out.println("voullez vour rejouer ?");
			i=input.nextInt();
		}

	}

}
