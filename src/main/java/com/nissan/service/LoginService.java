package com.nissan.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nissan.model.User;
import com.nissan.repo.IUserRepository;

@Service
public class LoginService implements UserDetailsService {
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Autowired
	private IUserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username);
		if(user == null)
			throw new UsernameNotFoundException("User not found with username: "+username);
		System.out.println(user.getPassword());
		return new org.springframework.security.core.userdetails.User
				(user.getUsername(),user.getPassword(),new ArrayList<>());
	}
	
	public User save(User user) {
		User newUser = new User();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setAge(user.getAge());
		newUser.setGender(user.getGender());
		newUser.setAddress(user.getAddress());
		newUser.setPhoneNumber(user.getPhoneNumber());
		newUser.setIsActive(user.getIsActive());
		newUser.setRoleId(user.getRoleId());
		return userRepo.save(newUser);
	}
	
	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}

}
