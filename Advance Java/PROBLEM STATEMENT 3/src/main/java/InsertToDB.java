import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertToDB {
	  public static void main(String[] args) {
	      Connection conn = null;
	      Statement stmt = null;
	      try {
	         try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	         } catch (Exception e) {
	            System.out.println(e);
	      }
	      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Tiger");
	      System.out.println("Connection is created successfully:");
	      stmt = (Statement) conn.createStatement();
	     
	      
	      
	      
	      
	      String query1 = "INSERT INTO Books " + "VALUES (4, 'Head First c#', 'Andrew stelman', 300.0)";
	      stmt.executeUpdate(query1);
	      
	      query1 = "INSERT INTO Books " + "VALUES (5, 'What is HTML?', 'Brett McLaughningMan', 450.0)";
	      stmt.executeUpdate(query1);
	      
	      query1 = "INSERT INTO Books " + "VALUES (6, 'HTML in Action', 'Joe Lennon', 540.0)";
	      stmt.executeUpdate(query1);
	      
	      query1 = "INSERT INTO Books " + "VALUES (7, 'OOP with C++', 'Balaguruswamy', 480.0)";
	      stmt.executeUpdate(query1);
	      
	      query1 = "INSERT INTO Books " + "VALUES (8, 'C++: The complete referemce', 'herbert schildt', 756.42)";
	      stmt.executeUpdate(query1);
	      
	      query1 = "INSERT INTO Books " + "VALUES (9, 'Head First SQL', 'Lynn Beighley', 450.0)";
	      stmt.executeUpdate(query1);
	      
	      query1 = "INSERT INTO Books " + "VALUES (10, 'Sql: the complete reference', 'James Groff', 667.0)";
	      stmt.executeUpdate(query1);
	      
	      
	      
	      System.out.println("Record is inserted in the table successfully..................");
	      } catch (SQLException excep) {
	         excep.printStackTrace();
	      } catch (Exception excep) {
	         excep.printStackTrace();
	      } finally {
	         try {
	            if (stmt != null)
	               conn.close();
	         } catch (SQLException se) {}
	         try {
	            if (conn != null)
	               conn.close();
	         } catch (SQLException se) {
	            se.printStackTrace();
	         }  
	      }
	      System.out.println("Please check it in the MySQL Table......... ……..");
	   }
	}

