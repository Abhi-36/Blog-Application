package com.app.controller;

import java.util.List;

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

import com.app.dto.UserDto;
import com.app.pojos.User;
import com.app.services.UserService;

import lombok.ToString;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"*"})
//@ToString
public class UserController 
{

	@Autowired
	private UserService userservice;
	
	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody UserDto userdto)
	{
		System.out.println(userdto);
		return ResponseEntity.ok(userservice.createUser(userdto));
		
    }
	@GetMapping("/getuser/{id}")
	public ResponseEntity<UserDto> getuserdto(@PathVariable Long id)
	{
		return ResponseEntity.ok(userservice.findByid(id));
		
	}
	
	@PutMapping("/updateuser/{id}")
	public ResponseEntity<UserDto> updateuserDto(@RequestBody UserDto userdto,@PathVariable Long id)
	{
		return ResponseEntity.ok(userservice.updateUser(userdto, id));
		
	}
	
	@DeleteMapping("deleteuser/{id}")
	public ResponseEntity<String> deleteuser(@PathVariable Long id)
	{
	return ResponseEntity.ok(userservice.deleteUSerBYid(id)); 	
	}
	
	@GetMapping("/getuserlist")
	public ResponseEntity<List<UserDto>> alluserlist(@RequestBody UserDto userdto)
	{
		return ResponseEntity.ok(userservice.getAllUsers());
		
	}
}
