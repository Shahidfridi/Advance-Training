import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUserTable {
	public class CreateTableOrder {
		static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
		   static final String USER = "root";
		   static final String PASS = "Tiger";
		   public static void main(String[] args) throws SQLException {
			    // Open a connection
			    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			       Statement stmt = conn.createStatement();) {
			    	 String sql2 = "CREATE TABLE Users " +
			                 "(Book_id INTEGER not NULL, " +
			                 " First_Name VARCHAR(255), " + 
			                 " Email VARCHAR(255), " +
			                 " Address VARCHAR(255), "+
			                 " User_Name VARCHAR(255), " +
			                 " Password VARCHAR(225), " + 
			                 " REGISTRATION_Date DATE, " ;
			         stmt.executeUpdate(sql2);
			         System.out.println("Created table in given database..."); 
			         
			      }
			      catch (SQLException e) {
			         e.printStackTrace();
			    }
}
}
}