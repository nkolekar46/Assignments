package com.demo.ass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginClass {
	 public static boolean validate(loginFormClass loginBean) throws ClassNotFoundException {
	        boolean status = false;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/practiceDB", "NITIN","Nitin@1997");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection
	            .prepareStatement("select * from LoginEmp where username = ? and password = ? ")) {
	            preparedStatement.setString(1, loginBean.getUsername());
	            preparedStatement.setString(2, loginBean.getPassword());

	            System.out.println(preparedStatement);
	            ResultSet rs = preparedStatement.executeQuery();
	            status = rs.next();

	        } catch (SQLException e) {
	            // process sql exception
	           e.printStackTrace();
	        }
	        return status;
	 }
	

}
