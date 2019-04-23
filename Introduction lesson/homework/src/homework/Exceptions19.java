package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Exceptions19 {

	public static void main(String[] args) {
		
		/*
		 * try{ File mFile = new File("C://Users/myfil.txt"); FileReader reader = new
		 * FileReader(mFile); } catch(FileNotFoundException fnf){ fnf.printStackTrace();
		 * //check the console to see details about the error produced }
		 */
		//Exceptions19.doDifference();
		
		MyAccountsExercise19 account = new MyAccountsExercise19(0);
		try {
			account.setBalance(-1000);
		} catch (MyExceptions e) {
			e.printStackTrace();
		}
	
	}
	public static void doDifference() throws ArithmeticException,UnsupportedOperationException{
		int first = 9;
		int last = 0;
		int diff = first / last;
		throw new UnsupportedOperationException("Operation Not Supported");
	}
}
