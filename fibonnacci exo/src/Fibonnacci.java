import java.util.Scanner;

public class Fibonnacci {

	public static void main(String args[])  { 
	Scanner input=new Scanner(System.in);
	System.out.println("veiller entrer un nombre");
	int nombre=input.nextInt();
		
	 int n1=0,n2=1,n3,i,count=nombre;    
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	//on debute a  2 parceque 0 et 1 sont prealablement  ecrit  
	 for(i=2;i<count;++i){   
		 
	  n3=n1+n2;    
	  System.out.print("  "+n3);    
	  n1=n2;    
	  n2=n3;    
	  
	 }    
	  
	} 

}
