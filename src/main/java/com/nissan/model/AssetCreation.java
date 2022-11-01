package com.nissan.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name="asset_master_tbl")
public class AssetCreation {
	
	//Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aMId;
	
	// Relation with Asset Table
	@JoinColumn(name="assetTypeId", insertable = false, updatable = false)
	@ManyToOne
	private AssetType aMTypeId;
	
	// Relation with Vendor Table
	@JoinColumn(name="vendorId", insertable = false, updatable = false)
	@ManyToOne
	private Vendors aMMakerId;
	
	// Relation with Asset Definition Table
	@JoinColumn(name="assetDefinitionId", insertable = false, updatable = false)
	@ManyToOne
	private AssetDefinition aMAssetDefinId;
	
	private String aMModel;
	private String aMNum;
	private String aMMyYear;
	private Date purchDate;
	private int aMWarranty;
	private Date warrantyFrom;
	private Date warrantyTo;
	
	//Default constructor
	public AssetCreation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	public AssetCreation(String aMModel, String aMNum, AssetType aMTypeId, Vendors aMMakerId,
			AssetDefinition aMAssetDefinId, String aMMyYear, Date warrantyFrom, int aMId, Date purchDate,
			Date warrantyTo, int aMWarranty) {
		super();
		this.aMModel = aMModel;
		this.aMNum = aMNum;
		this.aMTypeId = aMTypeId;
		this.aMMakerId = aMMakerId;
		this.aMAssetDefinId = aMAssetDefinId;
		this.aMMyYear = aMMyYear;
		this.warrantyFrom = warrantyFrom;
		this.aMId = aMId;
		this.purchDate = purchDate;
		this.warrantyTo = warrantyTo;
		this.aMWarranty = aMWarranty;
	}
	
	//Getters and setters
	public int getaMId() {
		return aMId;
	}

	public void setaMId(int aMId) {
		this.aMId = aMId;
	}

	public AssetType getaMTypeId() {
		return aMTypeId;
	}

	public void setaMTypeId(AssetType aMTypeId) {
		this.aMTypeId = aMTypeId;
	}

	public Vendors getaMMakerId() {
		return aMMakerId;
	}

	public void setaMMakerId(Vendors aMMakerId) {
		this.aMMakerId = aMMakerId;
	}

	public AssetDefinition getaMAssetDefinId() {
		return aMAssetDefinId;
	}

	public void setaMAssetDefinId(AssetDefinition aMAssetDefinId) {
		this.aMAssetDefinId = aMAssetDefinId;
	}

	public String getaMModel() {
		return aMModel;
	}

	public void setaMModel(String aMModel) {
		this.aMModel = aMModel;
	}

	public String getaMNum() {
		return aMNum;
	}

	public void setaMNum(String aMNum) {
		this.aMNum = aMNum;
	}

	public String getaMMyYear() {
		return aMMyYear;
	}

	public void setaMMyYear(String aMMyYear) {
		this.aMMyYear = aMMyYear;
	}

	public Date getPurchDate() {
		return purchDate;
	}

	public void setPurchDate(Date purchDate) {
		this.purchDate = purchDate;
	}

	public int getaMWarranty() {
		return aMWarranty;
	}

	public void setaMWarranty(int aMWarranty) {
		this.aMWarranty = aMWarranty;
	}

	public Date getWarrantyFrom() {
		return warrantyFrom;
	}

	public void setWarrantyFrom(Date warrantyFrom) {
		this.warrantyFrom = warrantyFrom;
	}

	public Date getWarrantyTo() {
		return warrantyTo;
	}

	public void setWarrantyTo(Date warrantyTo) {
		this.warrantyTo = warrantyTo;
	}
	
	//To string
	@Override
	public String toString() {
		return "AssetCreation [aMId=" + aMId + ", aMModel=" + aMModel + ", aMNum=" + aMNum + ", aMMyYear=" + aMMyYear
				+ ", purchDate=" + purchDate + ", aMWarranty=" + aMWarranty + ", warrantyFrom=" + warrantyFrom
				+ ", warrantyTo=" + warrantyTo + "]";
	}
	
	
	
	
	
}
