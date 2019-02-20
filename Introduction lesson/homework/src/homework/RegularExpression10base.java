package homework;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression10base {
	
	
	public String replace(String inputString) {
		
		 String pattern = "\\W";
		 String beginning = "^";
		 String end = "$";
		 String e = "e";
		 Pattern p = Pattern.compile(pattern);
		 Matcher m = p.matcher(inputString);
		 String replaced = null ;
		 int count=0;
		 replaced = m.replaceAll(""+count);
		 
		 Pattern secondPattern = Pattern.compile(beginning);
		 Matcher secondMatcher = secondPattern.matcher(replaced);
		 replaced = secondMatcher.replaceAll("*");
		 
		 Pattern thirdPattern = Pattern.compile(end);
		 Matcher thirdMatcher = thirdPattern.matcher(replaced);
		 replaced = thirdMatcher.replaceAll("*");
		 
		
		  Pattern fourthPattern = Pattern.compile(e);
		  Matcher fourthMatcher = fourthPattern.matcher(replaced); 
		  replaced = fourthMatcher.replaceAll("E");
		 
		return replaced;
		
	} 
	
	public RegularExpression10base() {
		
	}
}
