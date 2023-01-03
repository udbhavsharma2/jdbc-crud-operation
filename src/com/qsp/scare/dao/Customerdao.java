package com.qsp.scare.dao;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.qsp.care.connection.CustomerConnection;
import com.qsp.care.dto.Customer;


public class Customerdao 
{  Connection connection=null;
  public void insertCustomer(Customer customer) 
  {	
	  connection=CustomerConnection.getConnection();
	  
	  try {
		Statement statement=connection.createStatement();
		String insert="insert into care values('"+customer.getName()+"',"+customer.getId()+","+customer.getNumber()+")";
		statement.execute(insert);
		System.out.println("Data store");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  finally
	  {
		  try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  
  }
  public void updateCustomer(Customer customer)
	{
		connection=CustomerConnection.getConnection();
		
	

try {
	
	Statement statement=connection.createStatement();
	String update="update  care set name='"+customer.getName()+"'where id="+customer.getId()+"";
statement.executeUpdate(update);
System.out.println("data updated....");
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
  public void deleteCustomer(Customer customer)
	{
		connection =CustomerConnection.getConnection();
		
		try {
			Statement statement=connection.createStatement();
			String delete="delete from care where id  = "+customer.getId()+"";
			statement.execute(delete);
			System.out.println("Data deleted....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public List<Customer> displayCustomer()
  {
	  connection=CustomerConnection.getConnection();
	  
	  
	try {
		Statement statement = connection.createStatement();
		String select="SELECT * FROM CARE";
		  ResultSet resultset=statement.executeQuery(select);
		  
		  List<Customer> customers= new ArrayList<Customer>();
		  
		  while(resultset.next())
		  {
			  Customer customer= new Customer();
			  customer.setName(resultset.getString("name"));
			  customer.setId(resultset.getInt("id"));
			  customer.setNumber(resultset.getInt("number"));
			  customers.add(customer);
			  
			  
			  
			  
		  }
		  return customers;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return null;
	  
  }

}
