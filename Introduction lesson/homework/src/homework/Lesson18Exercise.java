package homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lesson18Exercise {
	
	Scanner input = new Scanner(System.in);
	
	public void directory() throws IOException{
		File dir = new File("Dir");
		if(!dir.exists()) { 
			System.out.println("Directory will be created");
			dir.mkdirs();
		}else System.out.println("Directory Exists");
		
		
	}
		public void files() throws IOException {
			
			 System.out.println("Type in 5 filename(s) to create : "); 
		  for(int a = 1; a <= 5; a++) {
			
		  	String x = input.nextLine(); 
		  File files = new File("Dir");
		  	File infile = new File(files, x);
		  	infile.createNewFile();
		  System.out.println("Created"); 
		  
		  FileWriter fw = new FileWriter(infile);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(x);
			bw.close();
		  }
		  System.out.println("All files created and text writen to them");
	}
	
}
