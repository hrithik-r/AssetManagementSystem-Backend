package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetDefinition;

public interface IAssetDefinitionService {
	public List<AssetDefinition> getAllAssetDefinitions();
	
	public AssetDefinition addAssetDefinition(AssetDefinition asset);
	
	public AssetDefinition updateAssetDefinition(AssetDefinition asset);

	public void deleteAssetDefinition(int assetDefinitionId);
}
