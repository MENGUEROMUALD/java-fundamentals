package homework;
//run in ioStreammain18

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lesson18Game implements java.io.Serializable {
	
	String name;
	int score;
	float points;
	transient int max_score = 100;
	
	public void start(){
		if(score == max_score){
			System.out.println("You have completed the game");
	}
		score += 5;
	}

	String fileDestination = "data.ser";
	
	public void serialize(){
		
		Lesson18Game game = new Lesson18Game();
		game.max_score = 100;
		game.points = 20.9f;
		game.score = 10;
		game.name = "Sudoku";
		
		try {
			File mFile = new File(fileDestination);
			if(!mFile.exists()){
			//mFile.mkdirs();
			mFile.createNewFile();
			}
			System.out.println(game.max_score+" "+game.points+" "+game.score+" "+game.name);
			FileOutputStream fos = new FileOutputStream(mFile);
			ObjectOutputStream ous = new ObjectOutputStream(fos);
			
			ous.writeObject(game);
			ous.flush();
			ous.close();
			fos.close();
			System.out.println("Object Serialized");
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void deserialize() {
		try {
			FileInputStream fis = new FileInputStream(fileDestination);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Lesson18Game game = (Lesson18Game) ois.readObject();
			System.out.println("Deserializing Object");
			System.out.println(game.toString());
			System.out.println(game.max_score+" "+game.points+" "+game.score+" "+game.name);
			ois.close();
			fis.close();
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
			e.printStackTrace();
			} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
	} 
}
