package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamExercises {
	
	 static char[] chars = {
		        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
		        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
		        'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
		        'y', 'z', '0', '1', '2', '3', '4', '5',
		        '6', '7', '8', '9', 'A', 'B', 'C', 'D',
		        'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
		        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
		        'U', 'V', 'W', 'X', 'Y', 'Z', '!', '@',
		        '#', '$', '%', '^', '&', '(', ')', '+',
		        '-', '*', '/', '[', ']', '{', '}', '=',
		        '<', '>', '?', '_', '"', '.', ',', ' '
		    };
	 
	 static Random r = new Random();
	
	public static void main(String[] args) {
		
		/*//Swap positions between a and b.
		int a = 5;
		int b = 7;
		
		a = a + b;
		b = a - b;
		System.out.println("b = "+b);
		a = a - b;
		System.out.println("a = "+a);
		=============================================================================================*/
		
		//ExamExercises.Prime();
		
		
		// how to convert numbers as integers and to string as words eg from 3 to three
		Scanner num = new Scanner(System.in);
		
		/*String[] unit = {" ","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
		String[] tens = {" ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String[] hundreds = {" ","hundred","thousand","million","billion"};
		
		System.out.println("Please type in a number : ");
		int x = num.nextInt();
		if(x < 20)
			System.out.println(x+" = "+unit[x]);
		else if(x < 100)
		System.out.println(x+" = "+(tens[(x/10)-1])+unit[x%10]);
		else if ((x < 1000) && (x%100 == 0))
			System.out.println(x+" = "+(unit[x/100]+hundreds[1]));
		else if ((x < 1000) && (x%100 < 20))
			System.out.println(x+" = "+(unit[x/100]+hundreds[1])+" and "+unit[x%100]);
		else if(x < 1000)
			System.out.println(x+" = "+(unit[x/100]+hundreds[1])+" and "+(tens[((x%100)/10)-1])+unit[(x%10)]);
		else if ((x%1000)== 0)
			System.out.println(x+" = "+(unit[x/1000]+hundreds[2]));
		else if ((x%1000) < 20)
			System.out.println(x+" = "+(unit[x/1000]+hundreds[2])+" and "+unit[(x%100)]);
		else if ((x%1000) < 100)
			System.out.println(x+" = "+(unit[x/1000]+hundreds[2])+" and "+(tens[(x%100/10)-1])+unit[((x%100)%10)]);*/
		
		// etc etc ..to be continued...
		
		//converting from decimals to roman numerals
		/*
		String[] romUnit = {" ","i","ii","iii","iv","v","vi","vii","viii","ix"};
		String[] romTens = {" ","x","xx","xxx","xL","L","Lx","Lxx","Lxxx","xc"};
		int i = 5;
		while(i  != 0) {
		System.out.println("Please type in a decimal whole number : ");
		float j = num.nextFloat();
		int u = (int) j;
	
		if(j < 10) 
		System.out.println(j+" = "+romUnit[u]);
			else if(j>=10 && j<100)
			System.out.println(j+" = "+romTens[u/10]+romUnit[u%10]);
		if(j == 100)
			System.out.println(j+" = c");
		int b = (i--);
		}*/
			
		
		//===========Encrypting and decrypting
	
  /*  String text = "This is awesome!";
    int offset = 5;
    
    String enc = encrypt(text, offset);
    System.out.println("Encrypted text: " + enc);
    
    String dec = decrypt(enc, offset);
    System.out.println("Decrypted text: " + dec);*/
		
	//	=============================
		
		//System.out.println(ExamExercises.fact(8));
		//System.out.println(ExamExercises.facto(8));
		//==============================================
				
		/*int numb = num.nextInt();
		int sums = 0;
		int products = 1;
		while(numb > 0){
			int g = (numb % 10);
			System.out.print(g);
		sums += numb % 10;
		products *= (numb % 10);
		numb /= 10;
		}
		System.out.println("\n"+numb);
		System.out.println(sums);
		System.out.println(products);*/
		
		/*int a = num.nextInt();
		int b = 1;
		if(a > 10)
			System.out.println("Out of range");
		else
			while(a > 0) {
				b*=(a--);
			}
		System.out.println(b%10);*/
		
		//System.out.println(ExamExercises.pro(5));
		//ExamExercises.pal();
		/*========================================================
		String input = "678656032";
		String a = "(+237)";
		String number = input.replaceFirst("(\\d{3})(\\d{2})(\\d{2})(\\d+)", "$1 $2 $3 $4");
		 
		//System.out.println(a+number);
		 ===========================================================*/
		
		/*
		String a = "\n\t   |\n\n\t   |";
		String b = "\t --\n\t   |\n\t --\n\t|\n\t --";
		String c = "\t --\n\t   |\n\t --\n\t   |\n\t --";
		String d = "\n\t|  |\n\t --\n\t   |";
		String e = "\t --\n\t|   \n\t --\n\t   |\n\t --";
		String f = "\t --\n\t|   \n\t --\n\t|  |\n\t --";
		String g = "\t --\n\t   |\n\n\t   |";
		String h = "\t --\n\t|  |\n\t --\n\t|  |\n\t --";
		String i = "\t --\n\t|  |\n\t --\n\t   |\n\t --";
		String j = "\t --\n\t|  |\n\n\t|  |\n\t --";
		
		System.out.println(c);*/
		
		/*int x = 5;
		String[] xter = {" --\n","|","  |\n"," --\n","\n|","  |","\n --"};		
		
		int[][] numb = {{0,1,2,4,5,6},{1,4},{0,2,3,4,6},{0,2,3,5,6},{1,2,3,5},{0,1,3,5,6},{0,1,3,4,5,6},{0,2,7},{0,1,2,3,4,5,6},{0,1,2,3,5,6}};
		for (int z = 0; z < numb[x].length; z++) 
			//System.out.print(xter[numb[x][z]]);*/		
		for(int x = 0; x < 10; x++) {
		int j = r.nextInt(6);
		int number = j+1;
		System.out.println(number);
		}
			
			
		/*int count;
		String word ="demonstration";
		char[] let = word.toCharArray();
		for (char a : let)
			System.out.print(a);
		*/
		//System.out.println(ExamExercises.duplicate());
	}
		public static boolean duplicate() {
	     String txt = "the green worm moves towards the green grass";
	     String[] words = txt.split(" ");
	        int count = 0;   
	            
	        for(int i = 0; i < words.length; i++) {  
	            count = 1;  
	            for(int j = 0; j < words.length; j++) {  
	                if(words[i].equals(words[j])) {  
	                    count++;  
	                }  
	            }  
	            if(count > 2)  
	                return true;
	            else 
	            	return false;
	        }
			return true;   
	      
		}
	
	public static void pal() {// if a number and the reverse are a match.===== needs correction.
	     int n = 0, m, a = 0,x;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any number:");
	        n = s.nextInt();
	        m = n;
	        while(n > 0)
	        {
	            x = n % 10;
	            a = a * 10 + x;
	            n = n / 10;
	        }
	        if(a == m)
	        {
	            System.out.println(m+" is Palindrome");
	        }
	        else
	        {
	            System.out.println(m+" is Not Palindrome");
	        }
	}
	
	public static int pro(int n) {
		if((n-1) < 1)
			return 1;
			
		return ((n* pro(n-1))%10);
	}
		//ExamExercises.tryial();

	
	static int x = 1362;
	public static void tryial() {
		int sum = 0;
		int mul = 0;
	String b = String.valueOf(x);
	
	char[] c = b.toCharArray();
	for (char d: c) {
	sum+=Integer.parseInt(String.valueOf(d));
	//mul*=d;
	System.out.print(d+" + ");
	}
	System.out.print(sum);
	//System.out.println(mul);
	//Collections.reverse(c1);
	
	
	}
	
	public static int fact(int n) {
		if(n <= 1)
			return 1;
		return n * fact (n-1);
	}
	public static int facto(int n) {
		for (int x = (n-1); x > 0; x--) // this is another option for factorial
		n*=x;
		return n;
	}
	

// Caesar cipher
static String encrypt(String text, int offset)
{
    char[] plain = text.toCharArray();

    for (int i = 0; i < plain.length; i++) {
        for (int j = 0; j < chars.length; j++) {
            if (j <= chars.length - offset) {
                if (plain[i] == chars[j]) {
                    plain[i] = chars[j + offset];
                    break;
                }
            } 
            else if (plain[i] == chars[j]) {
                plain[i] = chars[j - (chars.length - offset + 1)];
            }
        }
    }
    return String.valueOf(plain);
}

static String decrypt(String cip, int offset)
{
    char[] cipher = cip.toCharArray();
    for (int i = 0; i < cipher.length; i++) {
        for (int j = 0; j < chars.length; j++) {
            if (j >= offset && cipher[i] == chars[j]) {
                cipher[i] = chars[j - offset];
                break;
            }
            if (cipher[i] == chars[j] && j < offset) {
                cipher[i] = chars[(chars.length - offset +1) + j];
                break;
            }
        }
    }
    return String.valueOf(cipher);
}

		//===========Big O notation
   
	
	public static void Prime() {// determines a prime number;
		Scanner input = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("please type in a number : ");
		int x = input.nextInt();
		for (int i = 2; i < x; i++) {
		if(x%i == 0) {
			isPrime = false; break;
		}
			}
		if(isPrime) {
			System.out.println(x+" is a prime number"); 
		}
		else 
			System.out.println(x+" is not a prime number");
	}
}
