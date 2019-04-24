import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Excerci4 {
	
	static String filename;
	static String directory = System.getProperty("user.home");  
	static String fileNameTwo = "file.txt";  
	static String absolutePath = directory + File.separator + fileNameTwo;
	public static void main(String[] args) {
		deseWithFile();//appele de la methode afin d'elerter l'utilisateur sur la derniere operation qui a ete effectuer
		
		System.out.println(" a- premierement regardons si il s'agit d'un prionic number");
		System.out.println(" donner moi un chiffre svp");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		checkIsPrionick(num);
		serialize(num);///serialisation
		////////recuperation via la methode de serialisation
		try {
			deserialize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 
		}
		////enregistrement via la methode fichier 
		 try {
			storeWithFile(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	/**
	 * ici j'essai de voir si le numbre est prionic
	 * @param num
	 */
	public static void checkIsPrionick(int num) {
        int j = 0;
    
        for(int i=0; i<num; i++){
            if(i*(i+1) == num){
                j = 1;
                break;
            }
        }
         
        if(j == 1)
            System.out.println(" bravo est un nombre Pronic.");
        else
            System.out.println(" desole ce n'est pas un nombre prionic.");  
}
/**
 * enregistrement  du dernier nombre via la serialisation dans un fichier .ser
 * @param num
 */
	public static void serialize(int num) {
		Database object = new Database(num); 
		 filename = "file.ser"; 
		// Serialization 
				try{ 

					FileOutputStream file = new FileOutputStream(filename); 
					ObjectOutputStream out = new ObjectOutputStream(file); 
					out.writeObject(object); 
					out.close(); 
					file.close(); 
					
					System.out.println(" cependant votre test prionic a ete enregistrer !!! :) "); 

				} 
				
				catch(Exception e) 
				{ 
					e.printStackTrace();
				} 


				
	}
/**
 *  recuperation du dernier nombre via la deserialisation
 * @throws Exception
 */
	public static void deserialize() throws Exception {
		Database object1 = null; 
		// la deserialisation Deserialization 
		try{ 
			
			FileInputStream file = new FileInputStream(filename); 
			ObjectInputStream in = new ObjectInputStream(file); 
			object1 = (Database)in.readObject();
			in.close(); 
			file.close(); 
			System.out.println(" donc apres deserialization "); 
			System.out.println(" ------>> le nombre : " + object1.lastNumber + " a ete correctement enregistre par serialisation"); 
		    System.out.println("-------------------");
			
		} 
		
		catch(Exception ex) { 
			
			System.out.println("Exception a ete arrete"); 
		} 
	}
/**
 *  enregistrement du dernier nombre via un fichier
 * @param num
 * @throws Exception
 */
	public static void storeWithFile(int num) throws Exception {
		
		try(FileWriter fileWriter = new FileWriter(absolutePath)) {  
		    String fileContent = String.valueOf(num);
		    fileWriter.write(fileContent);
		} catch (IOException e) {
		    
		}

		try(FileReader fileReader = new FileReader(absolutePath)) {  
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileReader.read();
		    }
		    System.out.println(" <<------ : a ete correctement enregistre  par la methode de fichier aussi "); 
			
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	/**
	 * recuperation du dernier nombre via un fichier
	 */
	public static void deseWithFile() {
		try(FileReader fileReader = new FileReader(absolutePath)) {  
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print(""+(char)ch);
		        ch = fileReader.read();
		    }
		    
		    System.out.println(" est le dernier nombre enregistrer la derniere fois ");
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
	

}
