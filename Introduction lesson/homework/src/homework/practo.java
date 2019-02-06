package homework;

import java.util.Scanner;

public class practo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type in your name : ");
		String text = input.nextLine();
		System.out.println("Type in your age : ");
		String age = input.nextLine();
		System.out.println(text+" is "+age+" years old");

	}

}
