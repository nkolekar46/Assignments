package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// REGISTER DRIVER CLASS
			Class.forName("com.mysql.jdbc.Driver");

			// CREATE AND ESTABLISH CONNECTION
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceDB", "NITIN", "Nitin@1997");

			// STATEMENT
			Statement st = con.createStatement();
			// EXECUTE QUERY
			st.execute("insert into think_emp values(9,'Om')");
			st.execute("insert into think_emp values(1,'Ram')");
			st.execute("insert into think_emp values(2,'Raj')");
			st.execute("insert into think_emp values(3,'Omkak')");
			st.execute("insert into think_emp values(4,'Divya')");
			st.execute("insert into think_emp values(5,'Rahul')");

			ResultSet rs = st.executeQuery("select * from think_emp");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("name"));
			}
			// CLOSE CONNECTON
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
