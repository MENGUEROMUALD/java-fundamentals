
public class Cercle implements Shape{
		int rayon;
	public Cercle(int rayon) {
			super();
			this.rayon = rayon;
		}
	@Override
	public double cacluAire() {
		return rayon*rayon*3.14;
		// TODO Auto-generated method stub
		
	}

}
