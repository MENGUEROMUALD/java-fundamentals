


public class StringLesson {
	

	
	public static void main(String[] args) {
		/*String s="seven";
		char [] result = new char[5];
		s.getChars(0, 5, result, 0);
		System.out.println(result);*/
		
		//////////////regular test
		
		String test ="learn-code-at-seven ";
		String s ="learn code at seven";
		System.out.println(s.subSequence(0, 3));
		System.out.println(s.substring(6));
		
		String toto ="learn sOlo";
		System.out.println(toto.trim());
		
		/*for(String i : test.split("-")) {		
			System.out.println(test.startsWith("learn"));
			System.out.println("-------------------------------------");
			System.out.println(test.startsWith("code"));
			System.out.println("-------------------------------------");
			System.out.println(test.startsWith("le"));
		}*/
		
		
		/*System.out.println(test.startsWith("learn"));
		System.out.println("-------------------------------------");
		System.out.println(test.startsWith("code"));
		System.out.println("-------------------------------------");
		System.out.println(test.startsWith("le"));*/
		/*for(String i : s.split("-")) {
			
			System.out.println(i);
			
			
		}*/
		System.out.println();
		

		/*System.out.println(s.regionMatches(true, 7, "demy", 0,5));
		System.out.println(test.matches("(.*)demy"));
		*/

	
	
	}

}
