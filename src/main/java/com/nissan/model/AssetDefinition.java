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
			AssetType assetType) {
		super();
		this.assetDefinitionId = assetDefinitionId;
		this.assetDefinitionName = assetDefinitionName;
		this.assetDefinitionClass = assetDefinitionClass;
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
