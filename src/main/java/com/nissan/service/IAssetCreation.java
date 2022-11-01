package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetCreation;

public interface IAssetCreation {

	// get all vendors
	List<AssetCreation> getAllAssets();

	// Add an asset
	AssetCreation addAssets(AssetCreation asset);

	// Update an asset
	AssetCreation updateAssetDetails(AssetCreation asset);

//	// Delete an asset
//	AssetCreation deleteAsset();
}
