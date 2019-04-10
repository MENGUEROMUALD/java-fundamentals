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

public class Collectiions {

	public static void main(String[] args) {
		User user =new User("kenfack");
		User userTwo =new User("Marina");
		// TODO Auto-generated method stub
		List<String> name =new ArrayList<String>();
		name.add("kenfack");
		name.add("kamdjou");
		name.add("lilipop");
		name.add("Marshmalo");
		name.add("Nougat");
		for(String i : name) {
			System.out.println(i);
		}
		System.out.println("---------------------");
		System.out.println("after addAll() method we have : ");
		List<String> anotherList =new ArrayList<String>();
		anotherList.addAll(name);
		for(String x : name) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("after clear() method in anotherList we have : ");
		anotherList.clear();
		System.out.println("nothing ");
		System.out.println("---------------------");
		System.out.println("after contains() method in anotherList we have : ");
		System.out.println(anotherList.contains("Nougat"));
		System.out.println("---------------------");
		System.out.println("after contains() method in name List we have : ");
		System.out.println(name.contains("Nougat"));
		System.out.println("---------------------");
		System.out.println("after ListIterator in name List we have : ");
		Iterator<String> iter=name.iterator();
		ListIterator<String> seconditer=name.listIterator(2);
		/*while(iter.hasNext()) {
			System.out.println(iter.next());
			System.out.println(seconditer.next()+"-");
		}*/
		System.out.println("---------------------");
		System.out.println("set methode : ");
		Random ran=new Random();
		
		Set<Integer> inset = new HashSet<Integer>();
		for(int j=0;j<10;j++) 
			inset.add(ran.nextInt(10));
		System.out.println(inset);
		TreeSet<Integer> tset= new TreeSet<Integer>(inset);
		System.out.println("sorted set is ");
		System.out.println(tset);
		System.out.println("---------------------");
		
		Map map=new HashMap();
		map.put(user, "kenfack");
		map.put(userTwo, "marina");
		map.put("key", "Harvey");
		Map mmap=new HashMap();
		mmap.put("keyOne", "one");
		mmap.put(1, 1);
		mmap.putAll(map);
		Collection mapset = mmap.values();
		Set mapKeys =(Set)mmap.keySet();
		System.out.println(mmap.get("key1"));
		System.out.println(mmap.get("keyOne"));
		System.out.println("--------------- with user");
		System.out.println(map.get(user));
		System.out.println(map.get(userTwo));
		TreeMap tmap = new TreeMap();
		tmap.put(1, "one");
		tmap.put(2, "two");
		tmap.put(0, "three");
		SortedMap head=tmap.headMap(2);
		System.out.println(head);
		
	}
	

}
