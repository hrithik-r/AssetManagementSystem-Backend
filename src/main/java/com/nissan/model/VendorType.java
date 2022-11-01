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
@Table(name="vendorType")
public class VendorType {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int vendorTypeId;
	
	private String vendorTypeName;
	
	// many vendors have one vendor type
	@JsonIgnore
	@OneToMany(mappedBy="vendorType", cascade= CascadeType.ALL)
	List<Vendors> vendors;
	
	private boolean isActive;
	
	

	// Default Constructor
	public VendorType() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public VendorType(int vendorTypeId, String vendorTypeName, boolean isActive) {
		super();
		this.vendorTypeId = vendorTypeId;
		this.vendorTypeName = vendorTypeName;
		this.isActive = isActive;
	}

	
	//Getters And Setters
	public int getVendorTypeId() {
		return vendorTypeId;
	}

	public void setVendorTypeId(int vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}

	public String getVendorTypeName() {
		return vendorTypeName;
	}

	public void setVendorTypeName(String vendorTypeName) {
		this.vendorTypeName = vendorTypeName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	public List<Vendors> getVendors() {
		return vendors;
	}

	public void setVendors(List<Vendors> vendors) {
		this.vendors = vendors;
	}
	
	
	

	// toString method
	@Override
	public String toString() {
		return "VendorType [vendorTypeId=" + vendorTypeId + ", vendorTypeName=" + vendorTypeName + ", isActive="
				+ isActive + "]";
	}
	
	

}
