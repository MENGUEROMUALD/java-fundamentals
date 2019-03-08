package homework;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwitchExercise {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type in a statement or a word : ");
		String  statement = input.nextLine();
		String X = "^";
		Pattern f = Pattern.compile(X);
		Matcher m = f.matcher(statement);
		switch (statement) {
		case (X):
			System.out.println("first match : "+x);
		case (y):System.out.println("Second match : "+y+" Hurray you are within range.");
		default: System.out.println("out of range");break
		
		
		}
		
		
		

	}

}
