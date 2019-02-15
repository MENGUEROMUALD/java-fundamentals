package ExerciceTwo;

public class Player {
	public String name ;
	public int score;
	public int id;
	public Player(String name,int score,int id) {
		this.name=name;
		this.score=score;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
