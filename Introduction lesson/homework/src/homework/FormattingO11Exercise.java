package homework;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class FormattingO11Exercise {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.printf("Date : %td %1$tB, %1$tY\n",calendar);
		System.out.printf("Time : %tr %1$tZ\n", calendar);
		
		
				
		

	}

}
