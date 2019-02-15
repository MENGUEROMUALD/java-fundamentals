package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userlesson8 {
	
	String email;
	String password;
	
	
	
	public void setPassword(String password) {
		int len = password.length();
		if ( len >= 6 && len <=10) {
			this.password = password;
		}
		

	}
	
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		String reg= "^+@+\\..$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(email);		
		if(matcher.matches()) {
			this.email = email;
		}
		
		
	}
	public String getEmail() {
		return email;
	}
	public Userlesson8() {
		
	}

}
