
public class CardEx {
	
	String symboles;
	String face;
	
	public CardEx(String symboles, String face) {
		super();
		this.symboles = symboles;
		this.face = face;
	}
	public String getSymboles() {
		return symboles;
	}
	public void setSymboles(String symboles) {
		this.symboles = symboles;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}

	@Override
	public String toString() {
		return this.symboles + " " + this.face ;
	}
	

}
