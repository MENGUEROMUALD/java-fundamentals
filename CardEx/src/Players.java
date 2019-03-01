
public class Players {
	
	private String[] carte;
	private int point;
	private String name ;
	
	
	public Players(String[] carte, int point, String name) {
		super();
		this.carte = carte;
		this.point = point;
		this.name = name;
	}
	
	
	public String[] getCarte() {
		return carte;
	}


	public void setCarte(String[] carte) {
		this.carte = carte;
	}


	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
