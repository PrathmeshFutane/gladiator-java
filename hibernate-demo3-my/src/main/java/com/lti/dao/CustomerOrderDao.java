package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Customer;

public class CustomerOrderDao {
	//insert update
	public void save(Object obj) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			
			tx.begin();
			em.merge(obj);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
	
	//update by id
	public void updateNameBaseOnId(String name, int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			
			tx.begin();
			Customer customer = em.find(Customer.class, id);
			customer.setName(name);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
	
	
	//fetch all
	public List<Customer> fetchAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select c from Customer c";
			
		Query q = em.createQuery(jpql);
		List<Customer> list = q.getResultList();			
			
		em.close();
		emf.close();
			
		return list;
	}
	
	
	//fetch particular
	public Customer fetch(int id){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		
		Customer customer = em.find(Customer.class, id);
		
		em.close();
		emf.close();	
		
		return customer;
	}
	
	//fetch all from both table
	public List<Customer> fetchAllFromBothTable(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select c,o from Customer c join c.order_id o";
		

		Query q = em.createQuery(jpql);
		List<Customer> list = q.getResultList();			
			
		em.close();
		emf.close();
			
		return list;
	}
}
