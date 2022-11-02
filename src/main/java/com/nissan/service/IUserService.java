package com.nissan.service;

import java.util.List;

import com.nissan.model.User;

public interface IUserService {
	// Get all users
	List<User> getAllUsers();

	// Adding user
	User addUser(User user);

	// Updating user
	User updateUser(User user);

	// Deleting user
	void deleteUser(int userId);
}
