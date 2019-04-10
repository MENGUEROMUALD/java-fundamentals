import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recusion {

	public static void main(String[] args) {
		System.out.println("Question one : the time of the complexicity is :");
		System.out.println("T(n)=T(n-1)+T(n-2)+1 and the big o is : O(n) ");
		Recusion obj = new Recusion();
		System.out.println("Enter number of disks :- ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Move disks as below illustration.");
		obj.solveTowersOfHanoi(n, "A", "B", "C");
		System.out.println("entrer un nombre pour fibonnacci");
		int count = scanner.nextInt();
		int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);
		 ArrayList nombre= new ArrayList();
		 for(i=2;i<count;++i){  
		  n3=n1+n2;    
		  System.out.print(" "+n3);
		  nombre.add(n3);
		  n1=n2;    
		  n2=n3; 
		 }    
		 System.out.println(" ---");
		 int b=0,w;
		 for(int j=0;j<=nombre.size()-1;j++) {
			
			 System.out.println(nombre.get(j));
			 int temp =(int) nombre.get(j);
			 System.out.println(isPremier(temp));
		 }
	        
		
	}
	
	public void solveTowersOfHanoi(int n, String source, String aux, String dest){
		// If only 1 disk, make the move and return.
		if(n==1){
			System.out.println("disaue " + n +" va de : "+source+" pour "+dest);
			return;
		}
		// bouge le haut n-1 disque de A vers B utilise c comme auxiliaire
		solveTowersOfHanoi(n-1, source, dest, aux);
		
		System.out.println("disaue " + n +" va de : "+ source+" pour "+dest);
		
		// bouge n-1 dique de B pour C utilise A comme auxiliaire
		solveTowersOfHanoi(n-1, aux, source, dest);
		
	}
	public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
	
	public static String isPremier(int n) {
		String isPremier = "est un nombre premier";
		if (n < 0) {
			isPremier = "n'est pas un nombre premier"; 
			} else if (n != 0 && n != 1) { 
				for (int i = 2; i <= n/2; i++) { 
					
					if (n != i && n % i == 0) { 
						
						isPremier = "n'est pas un nombre premier"; break; 
						
						} 
					} 
				} 
		return isPremier; 
		}
}
