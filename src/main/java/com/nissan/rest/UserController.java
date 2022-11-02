package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.User;
import com.nissan.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("api/users")
public class UserController {
	//DI
	@Autowired
	IUserService userService;
	
	@GetMapping("/")
	List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
//	@PostMapping("/add")
//	User adduser(@RequestBody User user) {
//		return userService.addUser(user);
//	}
	
	@PutMapping("/update")
	User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/delete/{userId}")
	void deleteUser(@PathVariable int userId) {
		userService.deleteUser(userId);
	}
	
}
