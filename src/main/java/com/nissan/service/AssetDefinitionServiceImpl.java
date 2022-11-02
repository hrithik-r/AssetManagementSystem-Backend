package com.nissan.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetDefinition;
import com.nissan.repo.IAssetDefinitionRepo;

@Service
public class AssetDefinitionServiceImpl implements IAssetDefinitionService {
	@Autowired
	IAssetDefinitionRepo assetDefinitionRepo;
		
	@Override
	public AssetDefinition addAssetDefinition(AssetDefinition asset) {
		return assetDefinitionRepo.save(asset);
	}

	@Override
	public List<AssetDefinition> getAllAssetDefinitions() {
		return assetDefinitionRepo.findAll();
	}

	@Override
	public AssetDefinition updateAssetDefinition(AssetDefinition asset) {
		return assetDefinitionRepo.save(asset);
	}

	@Transactional
	@Override
	public void deleteAssetDefinition(int assetDefinitionId) {
		assetDefinitionRepo.disableById(assetDefinitionId);
	}

}
