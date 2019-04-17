import java.util.ArrayList;
import java.util.List;

public class Interpretation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		String[] OneToTen= {"one","two","three","Four","five","six","seven","eight","nine","ten"};
		String[] OneToTenGrand= {"hundred","twenty","thirty","Fourty","fity","sity","seventy","eighty","ninety",};
		int[] OneToTenNumb= {1,2,3,4,5,6,7,8,9,10};
		List list=new ArrayList<>();
		int number = 0;
		int temp;
		while(number!=0) {
			temp=number%10; 
			list.add(temp);
			number/=10; 
		}
		for(int i=0;i<OneToTen.length;i++){
			if(list.get(0).equals(OneToTenNumb[0])&&list.size()>3) {
				
			}
		}
		
	}
	public void number(int i) {
		
	}

}
