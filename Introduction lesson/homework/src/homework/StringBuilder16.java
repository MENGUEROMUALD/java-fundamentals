package homework;

public class StringBuilder16 {
	
	static Double myDouble = 2020.5d ;

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello, welcome to seven");
		System.out.printf("Characters: %s\n", sb.toString());
		System.out.printf("Capacity: %d\n", sb.capacity());
		System.out.printf("Length: %d\n", sb.length());
		System.out.println("");
		
		int old = sb.length();
		sb.setLength(5); // MODIFY LENGTH TO BE MORE THAN old(old+5)
		System.out.printf("Old length: %d, New length: %d\n", old,sb.length());
		System.out.printf(" %s\n", sb.toString());
		System.out.println("");
		
		int old1 = sb.capacity();
		System.out.printf("String %s, Current Capacity: %d\n",sb.toString(), old1);
		sb.ensureCapacity(old1*2);
		System.out.printf("%s. new capacity %d\n", sb.toString(), sb.capacity());
		System.out.println("");
		
		System.out.printf("Character %c",sb.charAt(3));
		sb.setLength(10);
		//System.out.printf("Character %c", sb.charAt(10) ); returns an error if index is invalid
		System.out.println("");
		
		System.out.println("");
		sb.setCharAt(0, 'W');
		System.out.printf("Characters %s", sb.toString() );
		System.out.println("");
		
		System.out.println("");
		sb.reverse();
		System.out.printf("Reversed as %s", sb.toString() );
		System.out.println("");
		
		System.out.println("");
		char[] destinationChars = new char[sb.length() -1 ];
		sb.getChars(0, sb.length() -1, destinationChars, 0);
		System.out.printf("Copied as %s", new String(destinationChars) );
		System.out.println("");
		
		System.out.println("");
		sb.append(". Thanks!");
		System.out.printf("Add to string %s", sb.toString() );
		System.out.println("");
		sb.append(1);
		System.out.println(sb.toString());
		System.out.println("");
		sb.append('F');
		System.out.println(sb.toString());
		System.out.println("");
		
		String s1 = "Hello";
		String s2 = "Hi";
		StringBuilder sb1 = new StringBuilder(s1);
		String s = s1 + s2; // OR s1 += s2;
		sb.append(s2);
		System.out.println(s);
		System.out.println(sb1.toString());
		System.out.println("");
		
		sb1.insert(5, " Andy");
		System.out.println(sb1.toString()); 
		System.out.println("");
		
		sb1.insert(0, "Andy");
		sb1.insert(1, 19);
		sb1.insert(2, new char[]{'w','e'});
		sb1.insert(3, 3.1415);
		System.out.println(sb1.toString());
		
		sb1.delete(1, 11);
		System.out.println(sb1.toString());
		sb1.delete(4, 9);
		System.out.println(sb1.toString());
		System.out.println("");
		
		sb1.deleteCharAt(0);
		System.out.println(sb1.toString());
		sb1.deleteCharAt(2);
		System.out.println(sb1.toString());
		System.out.println("");
		
		Character c = new Character('A');
		System.out.println(c);
		System.out.println("");
		
		System.out.printf("%b", Character.isLetter(c));
		System.out.println("");
		System.out.printf("%b", Character.isLetter('0'));
		System.out.println("");
		
		System.out.println("");
		System.out.printf("%b", Character.isDigit(c));
		System.out.println("");
		System.out.printf("%b", Character.isDigit('0'));
		System.out.println("");
		
		System.out.println("");
		System.out.printf("%b", Character.isWhitespace(c));
		System.out.println("");
		System.out.printf("%b", Character.isWhitespace(' '));
		System.out.println("");
		
		System.out.println("");
		System.out.printf("%b", Character.isUpperCase(c));
		System.out.printf("%b", Character.isUpperCase(' '));
		System.out.println("");
		
		System.out.println("");
		System.out.printf("%b", Character.isLowerCase(c));
		System.out.printf("%b", Character.isLowerCase('c'));
		System.out.println("");
		
		System.out.printf("%c", Character.toLowerCase(c));
		System.out.printf("%c", Character.toLowerCase('C'));
		System.out.println("");
		
		System.out.println("");
		System.out.printf("%c", Character.toUpperCase(c));
		System.out.printf("%c", Character.toUpperCase('c'));
		System.out.println("");
		
		System.out.printf("%s", Character.toString(c));
		System.out.printf("%c", Character.toString('c'));
		System.out.println("");
		
		// no output when run
		System.out.println("");
		Integer myInteger = 10; // boxes into an Integer object
		int mInt = myInteger ; // unboxes into int primitive type
		System.out.printf("%d", myInteger);
		System.out.printf("%d", mInt);
		
		System.out.printf("%d", myInteger.byteValue() );
		System.out.printf("%f", myInteger.floatValue() );
		
		System.out.printf("%d", myDouble.intValue() );
		System.out.printf("%f", myDouble.floatValue() );
		System.out.printf("%d", myDouble.byteValue());
		
	}

}
