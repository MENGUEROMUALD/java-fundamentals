package org.toubou;
import org.toubou.User;
public class Lesson6Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User("John",30,1.60F,"Male");
		User user2=new User();
		
		System.out.println("Name of user1: " + user1.getName());
		System.out.println("Age of user1: " + user1.getAge());
		System.out.println("Height of user1: " + user1.getHeight());
		System.out.println("Gender of user1: " + user1.getGender() +"\n");
		
		System.out.println("Name of user2: " + user2.getName());
		System.out.println("Age of user2: " + user2.getAge());
		System.out.println("Height of user2: " + user2.getHeight());
		System.out.println("Gender of user2: " + user2.getGender()+"\n");
        
		System.out.println("Equals user1: "+user1.hashCode());
		System.out.println("Equals user2: "+user2.hashCode());
	}

}
