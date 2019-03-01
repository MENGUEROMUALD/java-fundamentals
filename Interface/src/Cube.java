
public class Cube implements Shape{
		int arret;
	public Cube(int arret) {
			super();
			this.arret = arret;
		}
	@Override
	public double cacluAire() {
		return 6*(arret*arret);
		// TODO Auto-generated method stub
		
	}

}
