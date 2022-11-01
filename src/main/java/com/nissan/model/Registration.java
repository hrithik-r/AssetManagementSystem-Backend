package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblUserRegistry")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(nullable = false)
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String address;
	private long phoneNumber;
	
	@JoinColumn(name="loginId", insertable = false, updatable = false)
	@ManyToOne
	private Login login;
	
}
