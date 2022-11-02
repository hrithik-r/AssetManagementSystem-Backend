package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tblRole")
public class Role {
	// Auto generated ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	
	private String roleType;
	
	// Relation with child table
	@JsonIgnore		// Avoid recursive
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<User> users;

	// Default constructor
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized constructor
	public Role(int roleId, String roleType, List<User> users) {
		super();
		this.roleId = roleId;
		this.roleType = roleType;
		this.users = users;
	}

	// Getters and setters
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	// toString function
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleType=" + roleType + ", users=" + users + "]";
	}	
	
}
