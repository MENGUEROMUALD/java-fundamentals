import java.util.Scanner;

public class ExcerciceClass {
		String email;
		String password;
	public String getEmail() {
			return email;
		}
		public static void setEmail(String email) {
			
				while(email.matches("(.*).com")==false) {
					System.out.println("votre email n'est pas correcte");
					Scanner input=new Scanner(System.in);
					System.out.println("veiller entrer votre email");
					email= input.nextLine();
				}
		}
		public String getPassword() {
			return password;
		}
		public static void setPassword(String password) {
			if(password.length()<=6||password.length()>6) {
				while(password.length()<=6) {
					System.out.println("votre mot de passe n'est pas correcte");
					Scanner input=new Scanner(System.in);
					System.out.println("veiller entrer votre mot de passe");
					 password=input.nextLine();
				}
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("veiller entrer votre email");
		String email_user= input.nextLine();
		setEmail(email_user);
		System.out.println("veiller entrer votre mot de passe");
		String password_user=input.nextLine();
		setPassword(password_user);
		System.out.println(" vos information sont " );
		System.out.println(" email " + email_user);
		System.out.println("votre mot de passe " +password_user );
		
	}

}
