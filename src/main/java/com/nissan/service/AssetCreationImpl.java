package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetCreation;
import com.nissan.repo.IAssetCreationRepo;

@Service
public class AssetCreationImpl implements IAssetCreation{
	
	@Autowired
	IAssetCreationRepo assetRepo;
	
	//List of all assets
	@Override
	public List<AssetCreation> getAllAssets() {
		return (List<AssetCreation>) assetRepo.findAll();
	}
	
	//Add an asset
	@Transactional
	@Override
	public AssetCreation addAssets(AssetCreation asset) {
		return assetRepo.save(asset);
	}
	
	//Update asset
	@Transactional
	@Override
	public AssetCreation updateAssetDetails(AssetCreation asset) {
		return assetRepo.save(asset);
	}

}
