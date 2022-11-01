package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetCreation;
import com.nissan.service.IAssetCreation;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class AssetCreationController {
	
	@Autowired
	IAssetCreation assetService;
	
	//Show all assets
	@RequestMapping("assets")
	public List<AssetCreation> getAllAssets(){
		return assetService.getAllAssets();
	}
	
	//Adding an asset
	@PostMapping("asset")
	public AssetCreation addAssets(@RequestBody AssetCreation asset) {
		return assetService.addAssets(asset);
	}
	
	//Updating asset
	@PutMapping("asset")
	public AssetCreation updateAssetDetails(@RequestBody AssetCreation asset) {
		return assetService.updateAssetDetails(asset);
	}
}
