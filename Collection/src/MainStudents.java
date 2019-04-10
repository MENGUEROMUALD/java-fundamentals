import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainStudents {

	public static void main(String[] args) {
		Student studentOne = new Student("kenfack", 2, 2);
		Student studentTwo = new Student("Marina", 3, 3);
		Student studentThree = new Student("steven", 4, 4);
		Student studentFour = new Student("jean", 5, 5);
		Student studentFive = new Student("letou", 6, 6);
		Map tmap = new HashMap<Student,Integer>();
		tmap.put(studentOne, studentOne.getScore());
		tmap.put(studentTwo, studentTwo.getScore());
		tmap.put(studentThree, studentThree.getScore());
		tmap.put(studentFour, studentFour.getScore());
		tmap.put(studentFive, studentFive.getScore());
		Set stSet=tmap.keySet();
		System.out.println(stSet);
		afficher(tmap);
		
	}
	public static <K, V> void afficher(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("cle : " + entry.getKey() 
				+ " Valeur : " + entry.getValue());
        }
    }
}
