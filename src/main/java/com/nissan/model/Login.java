package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tblLogin")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	private String password;
	
	@Column(nullable = false)
	private String userType;
	
	@JsonIgnore		// Avoid recursive
	@OneToMany(mappedBy = "login", cascade = CascadeType.ALL)
	private List<Registration> registeredUsers;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(int loginId, String username, String password, String userType, List<Registration> registeredUsers) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.registeredUsers = registeredUsers;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List<Registration> getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(List<Registration> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + ", userType="
				+ userType + ", registeredUsers=" + registeredUsers + "]";
	}
	
}
