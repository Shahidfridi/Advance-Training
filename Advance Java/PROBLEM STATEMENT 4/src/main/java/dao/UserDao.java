package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.User;
public class UserDao {
	private Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}
//	method to insert in database
	public boolean saveUser(User user) {
		boolean f=false;

		try {
			String query="insert into users(first_name,address,email,user_name,password)values (?,?,?,?,?)";
			PreparedStatement pstmt	=this.con.prepareStatement(query);
			pstmt.setString(1,user.getFirst_name());
			pstmt.setString(2,user.getAddress());
			pstmt.setString(3,user.getEmail());
			pstmt.setString(4,user.getUname());
			pstmt.setString(5,user.getPass());
			
			pstmt.executeUpdate();
			f=true;
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}
	public User getUserByUnameAndPassword(String uname, String password) {
		User user=null;
		try {
			String query="select * from users where user_name=? and password=?";
			
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, uname);
			psmt.setString(2, password);
			
			ResultSet set=psmt.executeQuery();
			
			if(set.next()) {
				user=new User();
				//data from db
				user.setFirst_name(set.getString("First_Name"));
				//set to user object
				user.setEmail(set.getString("address"));
				user.setEmail(set.getString("email"));
				user.setUname(uname);
				user.setPass(set.getString("password"));
				user.setRegdate(set.getTimestamp("REGISTRATION_Date"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return user;
	}
	

}
