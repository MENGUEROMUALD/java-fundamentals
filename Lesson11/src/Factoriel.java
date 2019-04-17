import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Factoriel {
	public static void main(String[] args) {
		//System.out.println("entrer un chiffre");
		//Scanner input = new Scanner(System.in);
		//int i = input.nextInt();
		//fact(i);
		//palyndrome();
		//phone(237656209008l);
		//String lil="akuma";
		//lil.toUpperCase();//.charAt(0);
		//System.out.println(lil.toUpperCase().charAt(0)+""+lil.substring(1, lil.length()) );
		duplicity("bonjour bonjour les gens"); 
	
	        
	   
	}
	public static void fact(int a) {
		int b=a;
		a=1;
		if (b!=0){
			for (int i=1;i<=b;i++)
				a=a*i;
		}
		System.out.println("le fact " + a);
		int temps;
		List list=new ArrayList<>();
		while(a!=0) {
			int temp = a%10;
			list.add(temp);
			//System.out.println(temp);
			a/=10;
		}
		//System.out.println(list.size());
		System.out.println("le dernier digit est " +list.get(0));
		int verifiy=(int) list.get(0);
		if(1<=verifiy||10<=verifiy) {
			System.out.println("mais ne respecte pas la regles ");
		}
	
	}
	public static void palyndrome() {
		 int n, m, a = 0,x;
	        Scanner s = new Scanner(System.in);
	        System.out.print("entrer un nombre ");
	        n = s.nextInt();
	        m = n;
	        while(n > 0){
	            x = n % 10;
	            a = a * 10 + x;
	            n = n / 10;
	        }
	        if(a == m){
	            System.out.println("Given le nombre donner  "+m+" est Palindrome");
	        }
	        else
	        {
	            System.out.println("Given number " +m+ " n'est pas Palindrome");
	        }
	    }
	public static void phone(Long phone) {
		int temps;
		String numbre2 =String.valueOf(phone);
		System.out.print("+");
		System.out.print(numbre2.substring(0, 3)+" ");
		System.out.print(numbre2.substring(3,6 )+" ");
		System.out.print(numbre2.substring(6,8 )+" ");
		System.out.print(numbre2.substring(8,10 )+" ");
		System.out.print(numbre2.substring(10,12 )+" ");
	}
	
	public static void duplicity(String a) {
		String searchString = "spameggs 5 spambegg spameggsspamspam";
		String pattern = "egg{2,}";
		System.out.println("Original String: "+searchString);
		Pattern pp = Pattern.compile(pattern);
		Matcher mm = pp.matcher(searchString);
		String replaced = null ;
		if(mm.find()){
			replaced = mm.replaceAll("_");
			}
		System.out.println("New String: "+replaced);
		
		System.out.println(a);
		Matcher m;
		for(String regex:a.split(" ")) {
			Pattern p = Pattern.compile(regex+"{2,}");
			m = p.matcher(a);
			if(m.find()) {
				System.out.println(true);
			}
			System.out.println(p.toString());
			//System.out.println(regex+" "+matcher.groupCount());
			
			
		}
	}
	
}

	
