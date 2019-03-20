import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileSerializer implements Serializable{
	String firstName;
	String secondName;
	String thirdName;
	String fourName;
	String fiveName;
	String firstfileDestination ="firstName.txt";
	String secondfileDestination ="SecondName.txt";
	String thirdfileDestination ="thirdName.txt";
	String fourfileDestination ="fourName.txt";
	String fiveNamefileDestination ="fiveName.txt";
	
	public void getName() {
		
	}
	
	public void serialize(String premier, String deuxieme, String trois, String quatre, String five) throws IOException {
		FileSerializer name = new FileSerializer();
		FileSerializer secondname = new FileSerializer();
		FileSerializer troisname = new FileSerializer();
		FileSerializer quartrename = new FileSerializer();
		FileSerializer cinqname = new FileSerializer();
		name.firstName=premier;
		secondname.secondName=deuxieme;
		troisname.thirdName=trois;
		quartrename.fourName=quatre;
		cinqname.fiveName=five;
		try {
			File cinqnamefile = new File(fiveNamefileDestination);
			if(!cinqnamefile.exists()) {
				cinqnamefile.createNewFile();
				}
			FileOutputStream cinqfos = new FileOutputStream(cinqnamefile);
			ObjectOutputStream cinqsous=new ObjectOutputStream(cinqfos);
			cinqsous.writeObject(cinqname);
			cinqsous.flush();
			cinqsous.close();
			cinqsous.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			File quartrenamefile = new File(fourfileDestination);
			if(!quartrenamefile.exists()) {
				quartrenamefile.createNewFile();
				}
			FileOutputStream quatrefos = new FileOutputStream(quartrenamefile);
			ObjectOutputStream quatresous=new ObjectOutputStream(quatrefos);
			quatresous.writeObject(quartrename);
			quatresous.flush();
			quatresous.close();
			quatresous.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			File troisnamefile = new File(thirdfileDestination);
			if(!troisnamefile.exists()) {
				troisnamefile.createNewFile();
				}
			FileOutputStream troisfos = new FileOutputStream(troisnamefile);
			ObjectOutputStream troisous=new ObjectOutputStream(troisfos);
			troisous.writeObject(troisname);
			troisous.flush();
			troisous.close();
			troisous.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			File secondfile = new File(secondfileDestination);
			if(!secondfile.exists()) {
				secondfile.createNewFile();
				}
			FileOutputStream secondfos = new FileOutputStream(secondfile);
			ObjectOutputStream secondous=new ObjectOutputStream(secondfos);
			secondous.writeObject(secondname);
			secondous.flush();
			secondous.close();
			secondfos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			File mfile = new File(firstfileDestination);
			if(!mfile.exists()) {
				mfile.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(mfile);
			ObjectOutputStream ous=new ObjectOutputStream(fos);
			ous.writeObject(name);
			ous.flush();
			ous.close();
			fos.close();
	
		}catch(FileNotFoundException e) {
			
		}
	}
	public void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(firstfileDestination);
		FileInputStream secondfis = new FileInputStream(secondfileDestination);
		FileInputStream troifis = new FileInputStream(thirdfileDestination);
		FileInputStream quatrefis = new FileInputStream(fourfileDestination);
		FileInputStream cinqfis = new FileInputStream(fiveNamefileDestination);
		
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjectInputStream secois = new ObjectInputStream(secondfis);
		ObjectInputStream troicois = new ObjectInputStream(troifis);
		ObjectInputStream quatreois = new ObjectInputStream(quatrefis);
		ObjectInputStream cinqois = new ObjectInputStream(cinqfis);
		
		
		FileSerializer name = (FileSerializer) ois.readObject();
		FileSerializer secname = (FileSerializer) secois.readObject();
		FileSerializer troiname = (FileSerializer) troicois.readObject();
		FileSerializer quatrename = (FileSerializer) quatreois.readObject();
		FileSerializer cinqname = (FileSerializer) cinqois.readObject();
		
		
		ois.close();
		fis.close();
		
		secois.close();
		secondfis.close();
		
		troicois.close();
		troifis.close();
		
		quatreois.close();
		quatreois.close();
		
		cinqois.close();
		cinqois.close();
		System.out.println(quatrename.fourName);
		System.out.println(cinqname.fiveName);
		System.out.println(troiname.thirdName);
		System.out.println(secname.secondName);
		System.out.println(name.firstName);
	}
	
}

