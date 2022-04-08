
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
	   static final String USER = "root";
	   static final String PASS = "Tiger";
   
public static void main(String[] args) throws SQLException {
    // Open a connection
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
       Statement stmt = conn.createStatement();) {		      
        String sql = "CREATE TABLE Books " +
                 "(Book_id INTEGER not NULL, " +
                 " Name VARCHAR(255), " + 
                 " Author VARCHAR(255), " + 
                 " Price FLOAT, " + 
                 " PRIMARY KEY ( Book_id ))";
        String sql1 = "CREATE TABLE Order_Details " +
                "(Order_id INTEGER not NULL, " +
                "Book_id INTEGER not NULL, " +
                " Cust_Name VARCHAR(255), " +
                " Phone_No VARCHAR(255), " +
                " Address VARCHAR(255), " +
                " Order_Date DATE, " +
                " Quantity INTEGER, " 
                ;
        
        String sql2 = "CREATE TABLE Users " +
                "(Book_id INTEGER not NULL, " +
                " First_Name VARCHAR(255), " + 
                " Email VARCHAR(255), " +
                " Address VARCHAR(255), "+
                " User_Name VARCHAR(255), " +
                " Password VARCHAR(225), " + 
                " REGISTRATION_Date DATE, " ;
        stmt.executeUpdate(sql);
        System.out.println("Created table in given database..."); 
        
     }
     catch (SQLException e) {
        e.printStackTrace();
}
}
}