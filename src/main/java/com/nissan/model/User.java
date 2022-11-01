package com.nissan.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tblUser")
public class User {
	// Auto generated ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
		
	@Column(nullable = false)
	private String firstName;
	private String lastName;
	
	// Unique user_name for login
	@Column(nullable = false, unique = true)
	private String username;
	
	private String password;
	private int age;
	private String gender;
	private String address;
	private long phoneNumber;
	private boolean isActive;
	
	// Generating created date
	@CreationTimestamp
	private Instant createdAt;
	
	// Relation with parent table
	@JoinColumn(name="roleId", insertable = false, updatable = false)
	@ManyToOne
	private Role role;

	// Default constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor
	public User(int userId, String firstName, String lastName, String username, String password, int age, String gender,
			String address, long phoneNumber, boolean isActive, Instant createdAt, Role role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.role = role;
	}

	// Getters and setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	// toString function
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", isActive=" + isActive + ", createdAt=" + createdAt + ", role="
				+ role + "]";
	} 
	
}
