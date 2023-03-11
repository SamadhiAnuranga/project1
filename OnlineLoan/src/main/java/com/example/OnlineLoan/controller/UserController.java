package com.example.OnlineLoan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.OnlineLoan.exception.ResourceNotFoundException;
import com.example.OnlineLoan.model.User;
import com.example.OnlineLoan.repository.UserRepository;

@CrossOrigin (origins ="http://localhost:3000" )
@RestController 
@RequestMapping("/api/v2/")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	// get all employees
		@GetMapping("/users")
		public List<User> getAllItems(){
			return userRepository.findAll();
		}		
		@PostMapping("/users")
		public User createuser(@RequestBody User user) {
			return userRepository.save(user);
		}
		
		// get employee by id rest api
		@GetMapping("/users/{id}")
		public ResponseEntity<User> getuserById(@PathVariable Long id) {
			User user = userRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));
			return ResponseEntity.ok(user);
		}

}
