
public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] mots = {"toto","lolo","lallalala","liliiii","omegaRugalestAl"};
		
		String max=mots[0];
		
		for(int i=0;i<=mots.length;i++) {
			max = max(max, mots[i]);
		}
		System.out.println(max);
		
	}
	
	public static String max(String first,String second) {
		return (first.length()>second.length()?first:second);
	}

}
