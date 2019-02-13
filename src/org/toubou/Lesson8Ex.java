package org.toubou;

import java.util.Scanner;

public class Lesson8Ex {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a user email:");
        String email =input.next();
        System.out.println("Email is: " +email);
        
        @SuppressWarnings("resource")
		Scanner inpu = new Scanner(System.in);
		System.out.println("Enter a user password:");
        String pass =inpu.next();
        System.out.println("Password is: " +pass);
        
        UserLesson8 user = new UserLesson8();
        user.setEmail(email);
        user.setPassword(pass);
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
	}

}
