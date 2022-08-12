package com.tns.orderdetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="orderDetails")
public class OrderDetails{
	private int id;
	private  LocalDateTime dateOfpurchase;
	private	float total;
	//private  customer_id Customer;
	private String paymentmode;
	//private	shop_id shop;

	public OrderDetails()
	{	
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", dateOfpurchase=" + dateOfpurchase + ", total=" + total + ", paymentmode="
				+ paymentmode + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDateOfpurchase() {
		return dateOfpurchase;
	}
	public void setDateOfpurchase(LocalDateTime dateOfpurchase) {
		this.dateOfpurchase = dateOfpurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
}