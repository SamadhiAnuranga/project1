package com.example.OnlineLoan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnlineLoan.exception.ResourceNotFoundException;
import com.example.OnlineLoan.model.Item;
import com.example.OnlineLoan.repository.ItemRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;
	
	// get all employees
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return itemRepository.findAll();
	}		
	
	// create employee rest api
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}
	
	// get employee by id rest api
	@GetMapping("/items/{id}")
	public ResponseEntity<Item> getItemId(@PathVariable Long id) {
		Item item = itemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Item not exist with id :" + id));
		return ResponseEntity.ok(item);
	}
	
	// update employee rest api
	
	@PutMapping("/items/{id}")
	public ResponseEntity<Item> updateItem(@PathVariable Long id, @RequestBody Item itemDetails){
		Item item = itemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("item not exist with id :" + id));
		
		item.setItemName(itemDetails.getItemName());
		item.setPrice(itemDetails.getPrice());
		item.setCategoriName(itemDetails.getCategoriName());
		item.setBrandName(itemDetails.getBrandName());
		
		Item updatedItem = itemRepository.save(item);
		return ResponseEntity.ok(updatedItem);
	}
	
	// delete employee rest api
	@DeleteMapping("/items/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteitems(@PathVariable Long id){
		Item item = itemRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("item not exist with id :" + id));
		
		itemRepository.delete(item);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}
