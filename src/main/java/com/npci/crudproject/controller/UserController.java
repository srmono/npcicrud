package com.npci.crudproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.crudproject.entity.Users;
import com.npci.crudproject.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/allUsers")
	public ResponseEntity<List<Users>> getAllUsers(){
		
		List<Users> users = null;
		
		try {
			users = userService.getAllUsers();
			
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable("id") int userId){
		
		Users users = null;
		
		try {
			users = userService.getUserById(userId);
			
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	@PostMapping("/addorupdate") 
	public ResponseEntity<Users> addOrUpdate(@RequestBody Users user){
		
		Users users = null;
		
		try {
			users = userService.addOrUpdateUser(user);
			
		} catch (Exception ex) {
			ex.getMessage();
		}
		
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
}
