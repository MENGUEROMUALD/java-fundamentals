import java.util.Scanner;

public class Lesson11Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter a number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		for(int i=0;i<num;i++) 
		{
			for(int j=num;j>i;j--) 
			{
				System.out.print(" ");
			}
			int val=1;
			for(int j=0;j<=i;j++) 
			{
				System.out.print(val+" ");
				val=val*(i-j)/(j+1);
			}
			System.out.println();
		}

	}

}
