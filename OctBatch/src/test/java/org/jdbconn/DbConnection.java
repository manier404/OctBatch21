package org.jdbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Connection con = null;
//		1. load the driver.
		Class.forName("oracle.jdbc.driver.OracleDriver"); // path
//		2. connect to the database.
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
//		3. write a sql query.
		 String sql = "Select * from Employee";
		 
//		4. prepare a statement.
		 PreparedStatement Ps = con.prepareStatement(sql);
		 
//		5. execute the query.
		 ResultSet rs = Ps.executeQuery();
		 
//		6. Iterate the results.
		 try {
		 while (rs.next()) {
			System.out.println(rs.getInt("cid"));
			System.out.println(rs.getString("Cname"));
		}
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
//		7. close the database connection.
		 try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	
	}


