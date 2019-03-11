
public class LePlusLarge {
	public static String max(String first,String second) {
		
		return (first.length()>second.length()?first:second);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mots = {"toto","lolo","lallalala","liliiii","omegaRugalestAl"};
		String maximum=mots[1];
		for(int i=0;i<mots.length;i++) {
			maximum = max(maximum, mots[i]);
		}
		System.out.println(maximum);
	}
	
	

}
