package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.AssetType;
import com.nissan.repo.IAssetTypeRepo;
import com.nissan.service.IAssetTypeService;

@Service
public class AssetTypeServiceImpl implements IAssetTypeService {
	@Autowired
	IAssetTypeRepo assetTypeRepo;
	
	// get all asset types
	@Override
	public List<AssetType> getAllAssetTypes() {
		return assetTypeRepo.findAll();
	}

}
