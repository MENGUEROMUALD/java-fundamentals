package homework;

import java.util.Scanner;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormattingO11Exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.printf("Date : %td %1$tB, %1$tY\n",calendar);
		System.out.printf("Time : %tr %1$tZ\n", calendar);

		andy(1, 5);
	
	}
	public static void andy(int h, int height) {
		if(h>height)
			return;
		else {
			for (int i = 0; i< height-h; i++) {
				System.out.printf("\t");
			}
			for (int i =1; i<= h;) {
				System.out.printf("\t%d\t", i++);
			}
			System.out.println();
			andy(++h, height);
		}
		
	}
	
	

}
