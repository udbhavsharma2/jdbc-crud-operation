package com.qsp.care.service;

import java.util.List;

import com.qsp.care.dto.Customer;
import com.qsp.scare.dao.Customerdao;

public class CustomerService {
	
	Customerdao dao=new Customerdao();
	public void insertCustomer(Customer customer) 
	{
		dao.insertCustomer(customer);
	}
	public void updateCustomer(Customer customer)
	{
		dao.updateCustomer(customer);
	}
	public void deleteCustomer(Customer customer) 
	{
		dao.deleteCustomer(customer);
	}
	public List<Customer> displayCustomer()
	{
		return dao.displayCustomer();
	}

}
