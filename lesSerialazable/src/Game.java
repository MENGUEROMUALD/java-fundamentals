import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Game implements Serializable {
	String name;
	int score ;
	float points;
	transient int max_score=100;
	public void start() {
		if(score==max_score) {
			System.out.println("you have completed the gane");
		}
		score +=5;
	}
	
	String fileDestination ="data.txt";
	public void serialize() throws IOException {
		Game game = new Game();
		game.max_score=100;
		game.points=20.9f;
		game.score=10;
		game.name="akah";
		try {
			File mfile = new File(fileDestination);
			if(!mfile.exists()) {
				mfile.createNewFile();
			}
			System.out.println("before the serialization");
			FileOutputStream fos = new FileOutputStream(mfile);
			ObjectOutputStream ous=new ObjectOutputStream(fos);
			ous.writeObject(game);
			ous.flush();
			ous.close();
			fos.close();
			System.out.println(game.max_score);
			System.out.println(game.name);
			System.out.println(game.points);
			System.out.println(game.score);
			System.out.println("after serialization");
		}catch(FileNotFoundException e) {
			
		}
	}
	public void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileDestination);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Game game = (Game) ois.readObject();
		System.out.println("deserialization object");
		System.out.println(game.toString());
		ois.close();
		fis.close();
		System.out.println(game.max_score);
		System.out.println(game.name);
		System.out.println(game.points);
		System.out.println(game.score);
	}

}
