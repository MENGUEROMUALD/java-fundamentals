package homework;

public class Userlesson8 {
	
	String email;
	String password;
	
	public void setPassword(String password) {
		char[] pwd = new char[10];
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public Userlesson8() {
		
	}

}
