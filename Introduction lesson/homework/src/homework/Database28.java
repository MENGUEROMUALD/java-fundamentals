package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Database28 {
	
		private static final String DATABASE_URL = "jdbc:mysql://localhost/employees?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		public static void main(String[] args){
			
			Connection conn = null; //database connection
			Statement statement = null; //sql query statements
			ResultSet result = null; //sql result
			//TODO:retrieve credentials from command-line arguments
	
			String username = "root";
			String password = "andy";
		try {
			conn = DriverManager.getConnection(DATABASE_URL, username, password); //attempt connection to this database
	
		statement = conn.createStatement(); //prepare the query
		result = statement.executeQuery("SELECT * from employees"); //query to list all employees
		
		ResultSetMetaData metaData = result.getMetaData();
		int resultColumns = metaData.getColumnCount(); //number of columns of the database
		
		System.out.println("\n\t\t==============Employees==========\n");
		//display results from each column
		for(int i =1; i< resultColumns; i++)
		System.out.printf(" %s\t| ", metaData.getColumnName(i));
		System.out.println();
		
		while(result.next()){
			for(int j=1; j <= resultColumns; j++){
			System.out.printf(" %s\t\t ", result.getObject(j));
			}
			System.out.println();
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		

}
