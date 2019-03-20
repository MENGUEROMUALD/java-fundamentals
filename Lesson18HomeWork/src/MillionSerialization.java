import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MillionSerialization implements Serializable{
	int score;
	String playerName;
	String dataPlayerDest ="playerData.txt";
	public void serialize(int score, String nomdujouer) throws IOException {
		MillionSerialization data = new MillionSerialization();
		data.score=score;
		data.playerName=nomdujouer;
		try {
			File datafile = new File(dataPlayerDest);
			if(!datafile.exists()) {
				datafile.createNewFile();
				}
			FileOutputStream fos = new FileOutputStream(datafile);
			ObjectOutputStream ous=new ObjectOutputStream(fos);
			ous.writeObject(data);
			ous.flush();
			ous.close();
			ous.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(dataPlayerDest);
		ObjectInputStream ois = new ObjectInputStream(fis);
		MillionSerialization data = (MillionSerialization) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("le joueur precedent a fait :");
		System.out.println(data.score);
		System.out.println(data.playerName);
	}
}
