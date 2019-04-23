package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework21 {
	
	public static void main(String[] args) {
		
		List<String> myString = new ArrayList<String>();
		
		myString.add("Andy");
		myString.add("best");
		myString.add("Sally");
		myString.add("manu");
		
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		myNumbers.add(2);
		myNumbers.add(3);
		myNumbers.add(4);
		myNumbers.add(5);
		
		Iterator iterator = myString.iterator();  // lists all the elements in myString
			while(iterator.hasNext())
				System.out.println(iterator.next()); System.out.println("");
			
			ListIterator listIterator = myString.listIterator(1);  // lists all the elements in myString from index 1.
			while(listIterator.hasNext())
			System.out.println(listIterator.next()); System.out.println("");
			
			
			
		Set<Integer> intSet = new HashSet<Integer>();
			for(int j = 0; j < 10 ; j++)
				intSet.add(10 - j);
			System.out.println(intSet);
			
		TreeSet tSet = new TreeSet<Integer>(intSet);
		System.out.println("Sorted set is ");
		System.out.println(tSet);
		
	// maps
		User user = new User("Andy ",26,1.65f,"Male");
		User user1 = new User("Frank",28,1.70f,"Female");
		
		
		Map m = new HashMap();
		m.put(user, "Andy");
		
		Map mMap = new HashMap();
		mMap.put(user1, "Frank");
		
		mMap.put(1,1);
		mMap.putAll(m);
		
		Collection mapset = mMap.values();
		Set mapKeys = (Set) mMap.keySet();
		System.out.println(m.get(user));
		System.out.println(mMap.get(user1));
		
		TreeMap map = null;
		map.put(1,"one");
		map.put(2, "Two");
		map.put(3, "Three");
		SortedMap head = map.headMap(2);//headmap is lower value to the one passed as parameter and vice versa for tail
		
	}
	
	
	
	

}
