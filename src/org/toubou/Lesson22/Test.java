package org.toubou.Lesson22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
 
public class Test {
	public static class Counter {
	     int count;
	     Counter(int count) {
	         this.count = count;
	     }
	 
	     public String toString() {
	         return "Counter-" + count;
	     }
	}
	static {
        System.out.println(1/1);
    }
     @SuppressWarnings({ "unlikely-arg-type", "unchecked" })
	public static void main(String[] args) {
    	 
    	 List<Integer> lis = new ArrayList<>();
    	 lis.add(100);
    	 lis.add(200);
    	 lis.add(100);
    	 lis.add(200);
 
         System.out.println(lis);
         
    	 Period period = Period.of(0, 0, 0);
         System.out.println(period);
    	// short [2] arr1;
    	short arr[]=new short[2];
    	 arr[0]=0;
    	 System.out.println("HELLO");
    	 LocalDate date = LocalDate.parse("1947-08-14");
         LocalTime time = LocalTime.MAX;
         System.out.println(date.atTime(time));
         
         StringBuilder sb3 = new StringBuilder(100);
         System.out.println(sb3.length() + ":" + sb3.toString().length());
         System.out.println(sb3.toString());
         
         System.out.println("Output is: " + (10 != 5));
         
         String str9 = new String("Core");
         String str10 = new String("CoRe");
         System.out.println(str9 = str10);
         
         int a = 100;
         System.out.println(-a++);
         /*List<Character> list = new ArrayList<>();
         list.add(0, 'V');
         list.add('T');
         list.add(1, 'E');
         list.add(3, 'O');
 
         if(list.contains('O')) {
             list.remove('O');
         }
 
         for(char ch : list) {
             System.out.print(ch);
         }*/
    	 
    	 List<Integer> list6 = new ArrayList<Integer>();
    	 list6.add(new Integer(2));
    	 list6.add(new Integer(1));
    	 list6.add(new Integer(0));
 
    	 list6.remove(list6.indexOf(0));
 
         System.out.println(list6);
         List<Student> students = new ArrayList<Student>();
         students.add(new Student("James", 25));
         students.add(new Student("James", 27));
         students.add(new Student("James", 25));
         students.add(new Student("James", 25));
 
         students.remove(new Student("James", 25));
 
         for(Student stud : students) 
             System.out.printf(stud.toString());
         String s20 = new String("Hello");
         List<String> list = new ArrayList<>();
         list.add(s20);
         list.add(new String("Hello"));
         list.add(s20);
         s20.replace("l", "L");
         //System.out.println();
         System.out.println(list);
         
         StringBuilder sb = new StringBuilder("Java");
         String s1 = sb.toString();
         String s2 = sb.toString();
 
         System.out.println(s1 == s2);
         
         String str = "java";
         StringBuilder sb1 = new StringBuilder("java");
 
         System.out.println(str.equals(sb1) + ":" + sb1.equals(str));
         
         String s3 = "OCAJP";
         String s4 = "OCAJP" + "";
         System.out.println(s3 == s4);
         List<LocalDate> dates = new ArrayList<>();
         dates.add(LocalDate.parse("2018-07-11"));
         dates.add(LocalDate.parse("1919-02-25"));
         dates.add(LocalDate.of(2020, 4, 8));
         dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
 
         dates.removeIf(x -> x.getYear() < 2000);
 
         System.out.println(dates);
         
         LocalDateTime obj = LocalDateTime.now();
         System.out.println(obj.getSecond());
         
         ArrayList<Counter> original = new ArrayList<>();
         original.add(new Counter(10));
 
         ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
         cloned.get(0).count = 5;
 
         System.out.println(original);
         //LocalTime time = LocalTime.of(16, 40);
       //  String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
        // System.out.println(amPm);
         /*String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
         
         Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A");
 
         processStringArray(arr, p);
     }
 
     private static void processStringArray(String [] arr, 
                                                Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
         LocalDate date = LocalDate.of(2020, 9, 31);
         System.out.println(date);*/
         String fruit = "mango";
         switch (fruit) {
             
             case "Apple":
                 System.out.println("APPLE");
             case "Mango":
                 System.out.println("MANGO");
             case "Banana":
                 System.out.println("BANANA");
                 break;
             default:
                 System.out.println("ANY FRUIT WILL DO");
         }
         
         List<String> arraylist = new ArrayList<>();
         arraylist.add("AB");
         arraylist.add("BC");
         arraylist.add("CD");
         arraylist.add("DE");
         arraylist.add("EF");
         arraylist.add("FG");

         //lambda
        // arraylist.forEach(item->System.out.println(item));
           
         arraylist.forEach(item->{
              if("D".equals(item)){
                 System.out.println(item);
              }
         });
           
         //reference de méthode
        // arraylist.forEach(System.out::println);
          
         //Créer un filtre avec stream()
         //elle doit afficher CD en sortie
         arraylist.stream()
              .filter(s->s.contains("D"))
              .forEach(System.out::println);

         /*
         MyGraph<Number> graph=new MyGraph<Number>("MyGraph",5);
         graph.addEdge(2, 3);
         graph.addEdge(2, 4);
         graph.addEdge(3, 4);
         graph.addEdge(3, 2);
         graph.addEdge(4, 3);
         graph.addEdge(4, 2);
         graph.printGraph();*/
     }
}