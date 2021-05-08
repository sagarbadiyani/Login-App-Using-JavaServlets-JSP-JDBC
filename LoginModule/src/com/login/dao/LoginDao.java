package com.login.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:3306/mario";
	String username = "root";
	String password = "pwd";
	String query = "select * from login where uname = ? and pass = ?";
	
	public boolean checkCred(String uname, String pass) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();
		
		if(rs.next())
			return true;
		
		
		
		return false;
	}
}
