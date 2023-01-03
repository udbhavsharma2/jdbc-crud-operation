package com.qsp.care.controller;
import java.util.*;
import com.qsp.care.dto.Customer;
import com.qsp.care.service.CustomerService;


public class CustomerController {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		CustomerService customerservice=new CustomerService();
		System.out.println("Enter 1 for insert"); 
		System.out.println("Enter 2 for Update"); 
		System.out.println("Enter 3 for delete"); 
		System.out.println("Enter 4 for display");
		System.out.println("======================");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		boolean c=true;
		 
		 while(c)
		 {
			 switch(p)
			 { 
			 case 1:{
				 customer.setName("Raghav");
				 customer.setId(02);
				 customer.setNumber(998884);
				 customerservice.insertCustomer(customer);
				 
			 }break;
			 
			 case 2:{
				customer.setId(01) ;
				customer.setName("raghav");
				customerservice.updateCustomer(customer);
			 }break;
			 
			 case 3:{
				 
				 customer.setId(02) ;
				customerservice.deleteCustomer(customer);
				 
			 }break;
			 case 4 :
			 {
				 List<Customer> customers =customerservice.displayCustomer();
					for(Customer customer2:customers) 
					{
						
							System.out.println(customer2.getId());
							System.out.println(customer2.getName());
							System.out.println(customer2.getNumber());
							
					} 
					}break;
			 
			 
		
			 default:
					break;
				}
				
				c=false;
			}
			 
		 }
}

	


