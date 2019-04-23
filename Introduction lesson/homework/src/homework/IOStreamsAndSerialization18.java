package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOStreamsAndSerialization18 {

	// method to read and write byte streams

	void byteStreams() throws IOException {
		FileInputStream fileInput = new FileInputStream("../input.txt");
		FileOutputStream fileOutput = new FileOutputStream("../output.txt");

		int streamByte = 0;
		try {
			while ((streamByte = fileInput.read()) != -1) {
				fileOutput.write(streamByte);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			fileInput.close();
			fileOutput.close();
		}
	}

	public void charStream() throws IOException { // the same as the previous method
		
		FileReader fReader = null;
		FileWriter fWriter = null;

		try {
			fReader = new FileReader("input.txt");
			fWriter = new FileWriter("output.txt");

			int ch = 0;
			while ((ch = fReader.read()) != -1)
				fWriter.write(ch);
		} finally {
			if (fReader != null)
				fReader.close();

			if (fWriter != null)
				fWriter.close();
		}
	}
	
	public void myFiles() throws IOException { 
		File file = new File("file/myfile.txt");
		//check if the file(myfile) exists in folder(file) if not it creates them when instantiated.
		if(file.exists())
			System.out.println("File Exists!");
		else
			System.out.println("File does not exist. Creating.....");
	
		file.createNewFile();
	}
		
		public void myFiles1() throws IOException{
			File parentFile = new File("file");
			File childFile = new File(parentFile, "childfile.txt");
			
			//check if the parentfile(file folder) exists if not it creates one
			if(!parentFile.exists()) 
				parentFile.mkdirs();
			else if(childFile.exists())  //checks if childfile(file in File folder) exists and gets the path
				// if not it creates it using method myfiles.
				System.out.println("File path: "+childFile.getAbsolutePath());
			else
			childFile.createNewFile(); myFiles();
			
			System.out.println("File: "+childFile.getName());
			}

	
		  public void standardStreams() throws IOException{
		  
		  InputStreamReader reader = new InputStreamReader(System.in); 
		  	Scanner scanner = new Scanner(System.in);
		  	System.out.println("Enter any character. Press enter to end input"); 
		  char c;
		  while((c = (char) reader.read()) != '\n' ) 
			  System.out.print(c); //writing to standard output stream 
		  }
		  
		  
		 
}
