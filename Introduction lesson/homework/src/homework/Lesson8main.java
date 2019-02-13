package homework;
import java.util.Scanner;

import java.io.UnsupportedEncodingException;

public class Lesson8main {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		Scanner input = new Scanner(System.in);
		/*
		 * // "String are sequence of characters enclosed in double quotes". String
		 * myname = "Harvey Specter"; System.out.println(myname);
		 * System.out.println("Harvey Specter");
		 * 
		 * 
		 * char[] name = {'l','a','r','r','y'}; String mname = new String(name);
		 * System.out.println(mname);
		 * 
		 * //String class has 11 constructors and several methods e.g Public int length.
		 * String greetings = "Welcome, Sir"; System.out.println(greetings.length());
		 * 
		 * //String method public String concat(String str). String greet
		 * ="My name is "; String names ="larry";
		 * System.out.println(greet.concat(names)); System.out.println(greet+(names));
		 * 
		 * //String method public char charAt(int index) String nname = "Larry"; char a
		 * = nname.charAt(1); System.out.println(a);
		 * 
		 * //String method compareTo(String str) String bname = new String("larry"); int
		 * c = bname.compareTo("larry"); System.out.println(c);
		 * 
		 * //String method public int compareToIgnoreCase(String str) String cname = new
		 * String("larry"); int t = cname.compareToIgnoreCase("LaRRy");
		 * System.out.println(t);
		 * 
		 * //String method public boolean contentEquals(StringBuffer sb) StringBuffer
		 * buf = new StringBuffer("SevenAcademy"); String gname = "SevenAcademy";
		 * boolean result = gname.contentEquals(buf); System.out.println(result);
		 * 
		 * //String method public static String copyValueOf(char[]data) char[]java =
		 * {'j','a','v','a'}; String javaCopy = String.copyValueOf(java);
		 * System.out.println(javaCopy);
		 * 
		 * //String method public String copyValueOf(char[]ch,int offset, int count)
		 * String javacopy = String.copyValueOf(java, 0, 2);
		 * System.out.println(javacopy);
		 * 
		 * //String Method public boolean endsWith(String s) String suffix =
		 * "SevenAcademy"; boolean res = suffix.endsWith("xyz");
		 * System.out.println(res);
		 * 
		 * //String method public boolean equals(Object obj) String s = "SevenAcademy";
		 * boolean reslt = s.equals(new String ("SevenAcademy"));
		 * System.out.println(reslt);
		 * 
		 * //String method public boolean equalsIgnoreCase(String str) String g =
		 * "SevenAcademy"; boolean rslt = g.equalsIgnoreCase("Academy");
		 * System.out.println(rslt);
		 * 
		 * //String method public byte[] getBytes() String r = "seven"; byte[] rest =
		 * r.getBytes(); System.out.println(rest); 
		 * correct, they are byte codes
		 * 
		 * //string method public byte[]getBytes(String chset) String h = "seven";
		 * byte[]rst = h.getBytes("utf-8"); System.out.println(rst); // Faulty result
		 * instead of "seven"= correct they are byte Codes
		 * 
		 * //String method public void getChars(int srcStart, int srcEnd, char[]buf, int
		 * destStart) String u = "seven academy"; char[]relt = new char[5];
		 * u.getChars(0, 5, relt, 0); System.out.println(relt);
		 * 
		 * //String method public int hashCode() String p ="aA";
		 * System.out.println(p.hashCode());
		 * 
		 * //String method public int indexOf(char ch) String y = "seven academy";
		 * System.out.println(y.indexOf('e'));
		 * 
		 * //String method public int indexOf(String str) String i = "seven academy";
		 * System.out.println(i.indexOf("my"));
		 * 
		 * //String method public int lastIndexOf(int ch) String n = "seven academy";
		 * System.out.println(n.lastIndexOf('e'));
		 * 
		 * //String method public int lastIndexOf(String str) String v =
		 * "seven academy"; System.out.println(v.lastIndexOf("ac"));
		 * 
		 * //String method public boolean matches(String str) String x =
		 * "seven academy"; System.out.println(x.matches("(.*)demy"));
		 * System.out.println(x.matches("demy"));
		 * 
		 * //Test a string from public boolean matches... in class
		 * 
		 * System.out.println(x.matches("(.*)udemy")); System.out.println(" ");
		 * 
		 * //String method public boolean regionMatches(boolean ignoreCase, int toffset,
		 * String str, int offset, int len) String e = "seven academy";
		 * System.out.println(e.regionMatches(true, 9, "demy", 0,4));
		 * System.out.println(e.regionMatches(true, 0, "demy", 0,4));
		 * System.out.println(" ");
		 * 
		 * //String method public String replace(char oldChar, char newChar) String q =
		 * "seven academy"; System.out.println(q.replace('e', 'a'));
		 * System.out.println(q.replace('a', 'e'));
		 * 
		 * //String method public String replaceAll(String regex, String str) String z =
		 * "seven academy"; System.out.println(z.replaceAll("(.*)academy","Institute"));
		 * System.out.println(z.replaceAll("(.*)seven","First"));
		 * System.out.println(z.replaceAll("seven(.*)","First"));
		 * System.out.println(" ");
		 * 
		 * //String method public string replaceFirst(String regex, String str) String d
		 * = "seven academy";
		 * System.out.println(d.replaceFirst("(.*)academy","Institute"));
		 * System.out.println(d.replaceFirst("","Code"));
		 * 
		 * //String method public String[]split(String regex) String w =
		 * "the only way to learn-code is to code at-seven"; for(String
		 * split:w.split("-")) System.out.println(split);
		 * 
		 * //String method public String[] Split(String regex, int limit) String o =
		 * "the only way to learn code-is to code-at seven"; for(String
		 * split:o.split("-", 2)) System.out.println(split); System.out.println(" ");
		 * 
		 * //String method public boolean startsWith(String prefix) String k =
		 * "learn code at seven"; System.out.println(k.startsWith("learn"));
		 * System.out.println(k.startsWith("code"));
		 * System.out.println(k.startsWith("le"));
		 * 
		 * //String method public boolean startsWith(String prefix, int toffset) String
		 * j = "learn code at seven"; System.out.println(j.startsWith("learn",4));
		 * System.out.println(j.startsWith("code", 6)); System.out.println(" ");
		 * 
		 * //String method public CharSequence subSequence(int start, int end) String yu
		 * = "learn code at seven"; System.out.println(yu.subSequence(0,4));
		 * System.out.println(yu.subSequence(4,7));
		 * 
		 * //String method public String subString(int start) String uy =
		 * "learn code at seven"; System.out.println(uy.substring(0));
		 * System.out.println(uy.substring(4));
		 * 
		 * //String method public String subString(int start, int end) String hu =
		 * "learn code at seven"; System.out.println(hu.substring(0,4));
		 * System.out.println(uy.substring(4,7));
		 * 
		 * //String method public char[] to CharArray() String fd = "learn"; char[]chars
		 * = fd.toCharArray(); for(char gt : chars) System.out.println(gt);
		 * 
		 * //String method public String toLowerCase() String in = "LeArn SOlo";
		 * System.out.println(in.toLowerCase());
		 * 
		 * //String method public String toUpperCase() String re = "Learn SOlo";
		 * System.out.println(re.toUpperCase());
		 */
		//String method public String trim()
		/*
		 * String nh = " Learn SOlo "; System.out.println(nh);
		 * System.out.println(nh.trim());
		 * 
		 * //String method public String valueOf(Object object) int num = 123;
		 * System.out.println(String.valueOf(num));
		 * System.out.println(String.valueOf(5.5));
		 * 
		 * //String method public String format(String str, Object...args) String greets
		 * = "Welcome, my name is, %s";
		 * System.out.println(String.format(greets,"larry"));
		 * 
		 * //String method public PrintStream printf(String str, Object...args)
		 * System.out.printf("Welcome, my name is %s and i am %d years old","larry",9);
		 */
		Userlesson8 user = new Userlesson8();
		System.out.println();
		System.out.println("Enter Email : ");
		String asa = input.nextLine();
		user.setEmail(asa);
		
		System.out.println("Enter Password : ");
		String ase = input.nextLine();
		user.setPassword(ase);
		System.out.println("Your Email is : "+user.getEmail());
		System.out.println(" Your Password is : "+user.getPassword());
		
		
		
	}

}
