package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblAssetDefinition")
public class AssetDefinition {
	// Auto generated ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetDefinitionId;
	
	private String assetDefinitionName;
	private String assetDefinitionClass;
	private int assetTypeId;
	
	private boolean isActive;
	
	// Relation with parent table
	@JoinColumn(name="assetTypeId", insertable = false, updatable = false)
	@ManyToOne
	private AssetType assetType;

	// Default constructor
	public AssetDefinition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized constructor
	public AssetDefinition(int assetDefinitionId, String assetDefinitionName, String assetDefinitionClass,
			int assetTypeId, boolean isActive, AssetType assetType) {
		super();
		this.assetDefinitionId = assetDefinitionId;
		this.assetDefinitionName = assetDefinitionName;
		this.assetDefinitionClass = assetDefinitionClass;
		this.assetTypeId = assetTypeId;
		this.isActive = isActive;
		this.assetType = assetType;
	}

	// Getters and setters
	public int getAssetDefinitionId() {
		return assetDefinitionId;
	}

	public void setAssetDefinitionId(int assetDefinitionId) {
		this.assetDefinitionId = assetDefinitionId;
	}

	public String getAssetDefinitionName() {
		return assetDefinitionName;
	}

	public void setAssetDefinitionName(String assetDefinitionName) {
		this.assetDefinitionName = assetDefinitionName;
	}

	public String getAssetDefinitionClass() {
		return assetDefinitionClass;
	}

	public void setAssetDefinitionClass(String assetDefinitionClass) {
		this.assetDefinitionClass = assetDefinitionClass;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	// toString function
	@Override
	public String toString() {
		return "AssetDefinition [assetDefinitionId=" + assetDefinitionId + ", assetDefinitionName="
				+ assetDefinitionName + ", assetDefinitionClass=" + assetDefinitionClass + ", assetType=" + assetType
				+ "]";
	}

}
