package com.nissan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset_master_tbl")
public class AssetCreation {
	
	//Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aMId;
	
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
	public AssetCreation(int aMId, String aMModel, String aMNum, String aMMyYear, Date purchDate, int aMWarranty,
			Date warrantyFrom, Date warrantyTo) {
		super();
		this.aMId = aMId;
		this.aMModel = aMModel;
		this.aMNum = aMNum;
		this.aMMyYear = aMMyYear;
		this.purchDate = purchDate;
		this.aMWarranty = aMWarranty;
		this.warrantyFrom = warrantyFrom;
		this.warrantyTo = warrantyTo;
	}
	
	//Getters and setters
	public int getaMId() {
		return aMId;
	}

	public void setaMId(int aMId) {
		this.aMId = aMId;
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
