package com.tns.item;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ItemService {
	
	
	@Autowired
	private ItemRepository repo;
	
	public List<Item> listAll() {
		return repo.findAll();
	}
	
	public Item save(Item item) {
		repo.save(item);
		return item;
	}
	
	public Item get(Integer id) {
		Item item = repo.findById(id).get();
		return item;
	}

	public Item delete(Integer id) {
		Item item = repo.findById(id).get();
		repo.deleteById(id);                    
		return item;
	}}