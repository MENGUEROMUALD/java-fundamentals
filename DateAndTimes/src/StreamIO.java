import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamIO {

	public static void main(String[] args)  {
		
		try {
			byteStreams();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void byteStreams() throws IOException {
		int StreamByte=0;
		try {
			FileInputStream fileinput = new FileInputStream("input.txt");
			FileOutputStream fileOutput = new FileOutputStream("output.txt");
			while((StreamByte=fileinput.read())!=-1) {
				fileOutput.write(StreamByte);
			}
			fileinput.close();
			fileOutput.close();
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		file();
		
	}
	
	public static void read() throws FileNotFoundException {
		FileReader fReader = null;
		FileWriter fwriter = null;
		try {
			
			 fReader = new FileReader("input.txt");
			 fwriter = new FileWriter("output.txt");
			int ch=0;
			while((ch=fReader.read())!=-1) {
				fwriter.write(ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			if(fReader!=null) {
				try {
					fwriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			dossier();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void file() {
		File file = new File("monFichier.txt");
		if(file.exists()) {
			System.out.println("le fichier existe deja ");
		}else {
			System.out.println("le fichier a bien  ete cree");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void dossier() throws IOException {
		File dossier = new File("dossier");
		File fichier = new File(dossier,"fichierDuDossier.txt");
		if(!dossier.exists()) {
			System.out.println("dossier cree ");
			dossier.mkdir();
		}else if(fichier.exists()){
			System.out.println("le fichier a bien  ete cree"+fichier.getAbsolutePath());
			
		}else {
			fichier.createNewFile();
		}
	}
	

}
