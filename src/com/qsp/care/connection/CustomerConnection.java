package com.qsp.care.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomerConnection 
{
  public static Connection getConnection()
  {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		 String url="jdbc:mysql://localhost:3306 /jdbc-customer-care";
		 String user="root";
		 String pass="253barari@7";

		  Connection connection=DriverManager.getConnection(url, user, pass);
		  
		  return connection;
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return null;
  }

}
