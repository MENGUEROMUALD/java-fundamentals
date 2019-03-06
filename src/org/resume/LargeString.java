package org.resume;

public class LargeString {
	

	public static String maximum(String x,String y) {
		
	       return (x.length()>y.length()?x:y);
				
		}
		
	public static void main(String[] args) {
		
		String[] text={"allegra","taxi","litteralement","tomate","anxiete","necessite"};
		String max=text[0];
        for(int i=1;i<text.length;i++) {
        	max=maximum(max,text[i]);
        }
        
        System.out.println(max);
}
}
