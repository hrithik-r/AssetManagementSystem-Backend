	package com.nissan.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vendors")
public class Vendors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	
	private String vendorName;
	
	private int vendorTypeId;
	
	// many vendors have one role
	@JoinColumn(name="vendorTypeId", insertable=false, updatable=false) // vendor.vendorTypeId = vendorYtpe.vendorTypeId
	@ManyToOne
	private VendorType vendorType;
	
	private int assetTypeId;
	
	// many vendors have one asset type
	@JoinColumn(name="assetTypeId", insertable=false, updatable=false) // vendor.vendorTypeId = vendorYtpe.vendorTypeId
	@ManyToOne
	private AssetType assetType ;
	
	private LocalDate validFrom;
	
	private LocalDate validTo;
	
	private String address;
	
	private boolean isActive;
	
	
	private LocalDateTime createdTime = LocalDateTime.now();
	
	private LocalDateTime lastUpdate = LocalDateTime.now();

	
	// Default Constructor
	public Vendors() {
		super();
		// TODO Auto-generated constructor stub
	}


	// Parameterized Constructor
	public Vendors(int vendorId, String vendorName, int vendorTypeId, VendorType vendorType, int assetTypeId,
			AssetType assetType, LocalDate validFrom, LocalDate validTo, String address, boolean isActive) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorTypeId = vendorTypeId;
		this.vendorType = vendorType;
		this.assetTypeId = assetTypeId;
		this.assetType = assetType;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.address = address;
		this.isActive = isActive;
	}


	// Getters and Setters
	public int getVendorId() {
		return vendorId;
	}


	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public int getVendorTypeId() {
		return vendorTypeId;
	}


	public void setVendorTypeId(int vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}


	public VendorType getVendorType() {
		return vendorType;
	}


	public void setVendorType(VendorType vendorType) {
		this.vendorType = vendorType;
	}


	public int getAssetTypeId() {
		return assetTypeId;
	}


	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}


	public AssetType getAssetType() {
		return assetType;
	}


	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}


	public LocalDate getValidFrom() {
		return validFrom;
	}


	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}


	public LocalDate getValidTo() {
		return validTo;
	}


	public void setValidTo(LocalDate validTo) {
		this.validTo = validTo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}


	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}


	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}


	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	// toString Method
	@Override
	public String toString() {
		return "Vendors [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorTypeId=" + vendorTypeId
				+ ", vendorType=" + vendorType + ", assetTypeId=" + assetTypeId + ", assetType=" + assetType
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + ", address=" + address + ", isActive="
				+ isActive + ", createdTime=" + createdTime + ", lastUpdate=" + lastUpdate + "]";
	}

	

	

	
	
	
	
	
	

}
