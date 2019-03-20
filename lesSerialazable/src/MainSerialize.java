import java.io.IOException;

public class MainSerialize {

	public static void main(String[] args) {
	Game mainGame =new Game();
	try {
		mainGame.serialize();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		try {
			mainGame.deserialization();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
