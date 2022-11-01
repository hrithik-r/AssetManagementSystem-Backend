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
@Table(name = "tblAssetType")
public class AssetType {
	// Auto generated ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetTypeId;
	
	private String assetTypeName;
	
	// Relation with child table
	@JsonIgnore		// Avoid recursive
	@OneToMany(mappedBy = "assetType", cascade = CascadeType.ALL)
	private List<AssetDefinition> assetDefinitions;

	// Default constructor
	public AssetType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized constructor
	public AssetType(int assetTypeId, String assetTypeName, List<AssetDefinition> assetDefinitions) {
		super();
		this.assetTypeId = assetTypeId;
		this.assetTypeName = assetTypeName;
		this.assetDefinitions = assetDefinitions;
	}

	// Getters and setters
	public int getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public String getAssetTypeName() {
		return assetTypeName;
	}

	public void setAssetTypeName(String assetTypeName) {
		this.assetTypeName = assetTypeName;
	}

	public List<AssetDefinition> getAssetDefinitions() {
		return assetDefinitions;
	}

	public void setAssetDefinitions(List<AssetDefinition> assetDefinitions) {
		this.assetDefinitions = assetDefinitions;
	}

	// toString function
	@Override
	public String toString() {
		return "AssetType [assetTypeId=" + assetTypeId + ", assetTypeName=" + assetTypeName + ", assetDefinitions="
				+ assetDefinitions + "]";
	}
	
}
