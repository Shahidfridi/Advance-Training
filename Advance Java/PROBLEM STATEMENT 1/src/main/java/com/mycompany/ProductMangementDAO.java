package com.mycompany;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductMangementDAO {
	public static int viewall(Product pb) throws SQLException, ClassNotFoundException {
		String sql = " Select * from product";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {

			// pw.println(rs.getInt(1)+" "+rs.getString(2));
			System.out.println("\n id: "+rs.getInt(1) + "\n name: " + rs.getString(2) + "\n  price: " + rs.getInt(3));			count++;
		}
		return count;
	}

	public static int insert(Product pb) throws ClassNotFoundException, SQLException {
		String sql = "insert into product values(?,?,?)";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pb.getId());
		ps.setString(2, pb.getName());
		ps.setInt(3, pb.getPrice());
		return ps.executeUpdate();

	}

	public static int update(Product pb) throws SQLException, ClassNotFoundException {
		String sql = " Update product set  name =? , price = ?  where id = ?";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pb.getName());
		ps.setInt(2, pb.getPrice());
		ps.setInt(3, pb.getId());
		return ps.executeUpdate();
	}

	public static int delete(Product pb) throws SQLException, ClassNotFoundException {
		String sql = "delete from product where id =?";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pb.getId());
		return ps.executeUpdate();

	}

	public static int search(Product pb) throws SQLException, ClassNotFoundException {
		String sql = " select * from product where id =?";
		Connection con = DBUtil.dbConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pb.getId());
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			System.out.println("\n id: "+rs.getInt(1) + "\n name: " + rs.getString(2) + "\n price: " + rs.getInt(3));
			count++;
		}
		return count;

	}
}

	

