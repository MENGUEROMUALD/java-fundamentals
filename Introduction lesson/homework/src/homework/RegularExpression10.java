package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpression10 {

	public static void main(String[] args) {

		
		
		
		  String searchString = "This is my DT300S flying car"; String
		  pattern="(.*)(\\d+)(.*)"; Pattern p = Pattern.compile(pattern); // patternobject created 
		  Matcher m = p.matcher(searchString); //matcher created to run pattern against
		  
		  if(m.find()) { System.out.println("First match group: "+m.group(0));
		  System.out.println("Second match: "+m.group(1));
		  System.out.println("Third match: "+m.group(2)); }// needed a backward slash instead of forward
		 		 
		
		
		
		/*
		 * String searchString =" Father Francis fried five fishes from the river";
		 * String pattern =" F+"; //no space before Father won't print the
		 * indexforfather?????? Pattern p = Pattern.compile(pattern); // pattern object
		 * created Matcher m = p.matcher(searchString); int count= 0;//matcher created
		 * to run pattern against
		 * 
		 * while(m.find()) { System.out.println(""+(++count));
		 * System.out.println("Start Index: "+m.start());
		 * System.out.println("End Index: "+m.end()); }
		 */
		 
		 
		
		
		/*
		 * String searchString = "blue is the color of the sky"; String pattern ="blue";
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * //find match using lookingAt and matches methods
		 * 
		 * System.out.println("Match: "+m.lookingAt());
		 * System.out.println("Match: "+m.matches());
		 */
		 
		
		/*
		 * String searchString = "food is only good food when made with passion"; String
		 * pattern = "food";
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * 
		 * System.out.println("Using replaceFirst: "+m.replaceFirst("music"));
		 * System.out.println("Match: "+m.replaceAll("music"));
		 */
		 
		
		
		/*
		 * String searchString = "spameggsspambeggsspameggsspamspam"; String pattern =
		 * "spam*e";
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * StringBuffer sb = new StringBuffer(); while(m.find()) {
		 * m.appendReplacement(sb,"-"); } m.appendTail(sb);
		 * System.out.println(sb.toString());
		 */
		 
		
		
		/*
		 * String searchString = "spameggsspameggsspameggsspamspam"; String pattern =
		 * "spam*e";
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * StringBuffer sb = new StringBuffer(); catch (PatternSyntaxException pse){
		 * System.out.println("Description: "+pse.getDescription());
		 * System.out.println("Index: "+pse.getIndex());
		 * System.out.println("Pattern: "+pse.getPattern());
		 * System.out.println("Message: "+pse.getMessage()); } // did not execute
		 * 
		 */
		/*
		 * String searchString = "spameggs 8 spameggsspameggsspamspam"; String pattern =
		 * "^";
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * StringBuffer sb = new StringBuffer(); if(m.find()) {
		 * m.appendReplacement(sb,"*"); } System.out.println(sb.toString());
		 */
		
		
		/*
		 * String searchString = "spameggs 8 spameggsspameggsspamspam"; String pattern =
		 * "$";
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * StringBuffer sb = new StringBuffer(); if (m.find()) {
		 * m.appendReplacement(sb,"-"); } System.out.println(sb.toString());
		 */
		 
		
		/*
		 * String searchString = "spameggs 8 spameggsspameggsspamspam"; String pattern =
		 * ".";
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * StringBuffer sb = new StringBuffer(); if (m.find()) { m.appendReplacement(sb,
		 * "*"); } System.out.println(sb.toString());
		 */
		
		
		/*
		 * String searchString = "spameggs 5 [s] pameggsspameggsspamspam"; String
		 * pattern = "[egg]"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("*"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		/*
		 * String searchString = "spameggs 5 [s] pameggsspameggsspamspam"; String
		 * pattern = "[^egg]"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("*"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\A"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("*"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\z"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("*"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String
		 * pattern = "\\Z"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("*"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "sp*"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "sp+"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "sp?"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "5{1}"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "sp{1,}"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "spam{1,4}"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "sp|eg"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		
		/*
		 * String searchString = "spameggs 5 spamegg spameggsspamspam"; String pattern =
		 * "(ms)"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		  
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "(?:ms)"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "(?>ms)"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */ 
		
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\w"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\W"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\d"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\D"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\A"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		 
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam"; String pattern =
		 * "\\z"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggsspameggsspamspam\n"; String pattern =
		 * "\\Z"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggs spameggsspamspam"; String pattern
		 * = "\\b"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * String searchString = "spameggs 5 spameggs spameggsspamspam"; String pattern
		 * = "\\B"; System.out.println("Original String: "+searchString);
		 * 
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(searchString);
		 * String replaced = null ; if (m.find()) { replaced = m.replaceAll("_"); }
		 * System.out.println("New String: "+replaced);
		 */
		
		/*
		 * System.out.println("Type in a sentence "); Scanner input = new
		 * Scanner(System.in); String b = input.nextLine(); RegularExpression10base Man
		 * = new RegularExpression10base(); String replace = Man.replace(b);
		 * System.out.println("Original String: "+b);
		 * System.out.println("New String: "+replace);
		 */
	
		  
		  RegularExpressionHomework10 have = new RegularExpressionHomework10();
		  String search=have.search();
	}

}
