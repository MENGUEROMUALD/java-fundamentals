import java.util.SortedMap;
import java.util.TreeMap;

public class Student {
	
String name;
int id;
int score;


public Student(String name, int id, int score) {
	super();
	this.name = name;
	this.id = id;
	this.score = score;
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
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", score=" + score + "]";
}




	
}
