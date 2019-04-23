package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student21Exercise {
	
	String name;
	int id;
	float score;
	
	
	
	public Student21Exercise(String name, int id, float score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}



	public static void main(String[] args) {
	
		Student21Exercise[] student = new Student21Exercise[] {
				new Student21Exercise("Andy", 1, 20.05f),
				new Student21Exercise("Anderson", 2, 27.35f),
				new Student21Exercise("Andre", 3, 32.45f),
				new Student21Exercise("Andreas", 4, 23.00f),
				new Student21Exercise("Andrew", 5, 29.05f),
		};
	
	Map studentMap = new HashMap<Student21Exercise, Float>();
		for(Student21Exercise st : student)
			studentMap.put(st, st.getScore());
		Set sortStudent = studentMap.entrySet();
		System.out.println(studentMap);
		
		Iterator iterator = sortStudent.iterator();
		
		while(iterator.hasNext()){
			Entry<Student21Exercise, Float> st = (Map.Entry<Student21Exercise, Float>) iterator.next();
			System.out.println();
	
	}

	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public float getScore() {
		return score;
	}



	public void setScore(float score) {
		this.score = score;
	}
}
