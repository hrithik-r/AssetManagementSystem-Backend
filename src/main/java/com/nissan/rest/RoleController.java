package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Role;
import com.nissan.service.RoleService;

@CrossOrigin
@RestController
@RequestMapping("api/roles")
public class RoleController {
	@Autowired
	RoleService roleService;
	
	@GetMapping("/")
	public List<Role> getAllRoles(){
		return roleService.getAllRoles();
	}
}
