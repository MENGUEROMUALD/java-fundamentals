
public class mainGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameClient a= new GameClient();
		GameServer b=new GameServer();
	
		b.start();
		a.start();
	}

}
