
public class StepArrays {
	public static void main (String args[]) {
		int[] array= {1,1,1,2,2,2};
		stepped(array);
		
		
	}
	
	public static void stepped(int[] array) {
		for(int i=0 ;i<=array.length;i++) {
			if(array[0]>=array[4]) {
				System.out.println("faux");
				break;
			}else if(array[i]== array[i+1]&&array[i]== array[i+2]&&array[i]< array[i+3]){
				System.out.println("vrai");
				break;
			}
		}
		/*for(int i=0 ;i<=array.length;i++) {
			if(array[i]== array[i+1]&&array[i]== array[i+2]&&array[i]< array[i+3]) {
				if(array[i]== array[i+1]&&array[i]== array[i+2]){
					boolean premierPaquet =true;
				}
					System.out.println("vrai");
					break;
			}else {
				System.out.println("faux");
				break;
			}
		}*/
		
	}
	public static long fibonacci(int n) {
        if (n <= 1) 
        	return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}
