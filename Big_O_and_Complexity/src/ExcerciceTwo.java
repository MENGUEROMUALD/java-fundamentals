import java.util.Scanner;

public class ExcerciceTwo {
	public static void main(String [] args) {
		System.out.println("what is quick sort algorithm ?");
		System.out.println("-Quicksort (parfois appelé tri par échange de partitions) est un algorithme de tri .\nServant de méthode systématique pour placer les éléments d'un fichier à accès aléatoire ou d'un tableau dans l'ordre. ");
		System.out.println("what is complexity ?");
		System.out.println("- O (n log n)");
		System.out.println("What alternative way would you use to have your data sorted before\n" + 
				"it is even stored? ");
		System.out.println("- we use merge sort");
		System.out.println("Design an algorith with O(1)");
		System.out.println("----------------------------");
		Scanner input=new Scanner(System.in);//big o(1)
		System.out.println("enter your name");
		String name =input.nextLine();//big o(1)
		System.out.println(" your name is " + name +" and we write this code with the complexity Big-O(1) ");//big o(1)
		
		
		
	}

}

