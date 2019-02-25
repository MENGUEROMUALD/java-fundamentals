import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionReguliere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter a string");
			Scanner input =new Scanner(System.in);
			String string =input.nextLine();
			take(string);
			
	}
	public static void take(String string ) {
		String b=string;
		String pattern=" ";
		Pattern p =Pattern.compile(pattern);
		Matcher m= p.matcher(b);
		String text = m.replaceAll("8");		
		String pattern2="E";
		Pattern p2 =Pattern.compile(pattern2);
		Matcher m2= p2.matcher(text);
		text= m2.replaceAll("e");
		String pattern3="\\A";
		Pattern p3 =Pattern.compile(pattern3);
		Matcher m3= p2.matcher(text);
		text= m3.replaceFirst("*");
		System.out.println(text);
		
		
	}

}
