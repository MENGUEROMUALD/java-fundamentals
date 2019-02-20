package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionHomework10 {
	
	static String passage = "SCENE I. Rousillon. The COUNT's palace. Enter BERTRAM, the COUNTESS of Rousillon, HELENA, and LAFEU,\r\n" + 
			"all in black  COUNTESS  In delivering my son from me, I bury a second husband. BERTRAM  And I in going,\r\n" + 
			"madam, weep o'er my father's death anew: but I must attend his majesty's command, to whom I am now\r\n" + 
			"in ward, evermore in subjection. LAFEU  You shall find of the king a husband, madam; you, sir, a father:\r\n" + 
			"he that so generally is at all times good must of necessity hold his virtue to you; whose worthiness\r\n" + 
			"would stir it up where it wanted rather than lack it where there is such abundance. COUNTESS  What\r\n" + 
			"hope is there of his majesty's amendment? LAFEU  He hath abandoned his physicians, madam; under whose\r\n" + 
			"practices he hath persecuted time with hope, and finds no other advantage in the process but only the\r\n" + 
			"losing of hope by time. COUNTESS  This young gentlewoman had a father,--O, that 'had'! how sad a passage\r\n" + 
			"'tis!--whose skill was almost as great as his honesty; had it stretched so far, would have made nature\r\n" + 
			"immortal, and death should have play for lack of work. Would, for the king's sake, he were living! I\r\n" + 
			"think it would be the death of the king's disease.\r\n" + 
			"";
	public static String search() {
		String word = "have+";
		Pattern H = Pattern.compile(word);
		Matcher M = H.matcher(passage);
		int x=0;
		
		while(M.find()) {
			System.out.println(""+(++x));
			 System.out.println("Start Index: "+M.start());
			  System.out.println("End Index: "+M.end());
		}
		
		return null;
	}
	 public RegularExpressionHomework10 () {
		 
	 }

}
