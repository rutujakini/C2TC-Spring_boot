package com.tns.orderdetails;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderDetailsService {
	
	
	@Autowired
	private OrderDetailsRepository repo;
	
	public List<OrderDetails> listAll() {
		return repo.findAll();
	}
	
	public OrderDetails save(OrderDetails orderDetails) {
		repo.save(orderDetails);
		return orderDetails;
	}
	
	public OrderDetails get(Integer id) {
		OrderDetails orderDetails = repo.findById(id).get();
		return orderDetails;
	}

	public OrderDetails delete(Integer id) {
		OrderDetails orderDetails = repo.findById(id).get();
		repo.deleteById(id);                    
		return orderDetails;
	}}