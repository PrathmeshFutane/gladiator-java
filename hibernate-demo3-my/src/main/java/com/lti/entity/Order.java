package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_order")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private int id;

	private LocalDate orderDate;
	private String productName;
	private int totalCost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.productName+" "+this.totalCost+" "+this.id+" "+this.orderDate;
	}
	
	//private Customer customer;//NO NO NEVER
	
	


}
