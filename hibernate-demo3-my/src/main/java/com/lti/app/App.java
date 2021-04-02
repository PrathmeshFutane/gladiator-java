package com.lti.app;

import java.time.LocalDate;
import java.util.List;

import com.lti.dao.CustomerOrderDao;
import com.lti.entity.Customer;
import com.lti.entity.Order;

public class App {
	public static void main(String[] args) {
		
//		========================1 insert==============
//		CustomerOrderDao codao = new CustomerOrderDao();
//			
//		Customer cu = new Customer();
//		cu.setAddress("nagpur colony");
//		cu.setEmail("roman@gmail.com");
//		cu.setMobileNumber(1234567890);
//		cu.setName("roman");
//		
//		Order or = new Order();
//		or.setOrderDate(LocalDate.of(1999, 2, 2));
//		or.setProductName("tshirt");
//		or.setTotalCost(10000);
//		
//		cu.setOrder(or);
//		codao.save(cu);
//		System.out.println(" added successfully");
		

		//=================2 fetch all=================
//		CustomerOrderDao codao = new CustomerOrderDao();
//		List<Customer> list = codao.fetchAll();
//		for(Customer cc : list)
//			System.out.println(cc.toString());
		
		
		//===============3 fetch only one ===========
//		name
//		Customer customer = codao.fetch(49);
//		customer.getId();
//		System.out.println(customer.toString());
		
		
		//===============5 update by id =============
		CustomerOrderDao codao = new CustomerOrderDao();
		codao.updateNameBaseOnId("mack", 49);
		System.out.println("updated");
		
		//===============4 fetch all from both table
//		CustomerOrderDao codao = new CustomerOrderDao();
//		for(Customer ob : codao.fetchAllFromBothTable()) {
//			System.out.println(ob.toString());
//		}
			
		
	
	
	
	
	}
}
