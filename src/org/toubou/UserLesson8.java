package org.toubou;

public class UserLesson8 {
	String email;
    String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.matches("(.*)@(.*)")) 
				this.email = email;
		else 
			System.out.println("The email format is wrong!");
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.length()>6 && password.length()<10)
		    this.password = password;
		else
			System.out.println("The password must not be less than 6 characters and not greater than 10 characters");
	}
}
