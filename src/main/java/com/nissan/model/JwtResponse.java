package com.nissan.model;

public class JwtResponse {
	private final String jwttoken;
	private String username;
	private Integer roleId;


	public JwtResponse(String jwttoken, String username, Integer roleId) {
		super();
		this.jwttoken = jwttoken;
		this.username = username;
		this.roleId = roleId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getJwttoken() {
		return jwttoken;
	}
}
