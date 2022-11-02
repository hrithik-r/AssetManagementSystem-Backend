package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetType;
import com.nissan.service.IAssetTypeService;

@CrossOrigin
@RestController
@RequestMapping("api/asset-type")
public class AssetTypeController {
	@Autowired
	IAssetTypeService assetTypeService;
	
	@GetMapping("/")
	List<AssetType> getAllAssetTypes(){
		return assetTypeService.getAllAssetTypes();
	}
}
