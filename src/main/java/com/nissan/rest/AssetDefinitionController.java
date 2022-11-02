package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetDefinition;
import com.nissan.service.IAssetDefinitionService;

@CrossOrigin
@RestController
@RequestMapping("api/asset-definition")
public class AssetDefinitionController {
	
	@Autowired
	IAssetDefinitionService assetDefinitionService;
	
	@GetMapping("/")
	List<AssetDefinition> getAllAssetDefinitions(){
		return assetDefinitionService.getAllAssetDefinitions();
	}
	
	@PostMapping("/add")
	AssetDefinition addAssetDefinition(@RequestBody AssetDefinition asset) {
		return assetDefinitionService.addAssetDefinition(asset);
	}
	
	@PutMapping("update")
	AssetDefinition updateAssetDefinition(@RequestBody AssetDefinition asset) {
		return assetDefinitionService.updateAssetDefinition(asset);
	}
	
	@PostMapping("/delete/{assetDefinitionId}")
	void deleteAssetDefintion(@PathVariable int assetDefinitionId) {
		assetDefinitionService.deleteAssetDefinition(assetDefinitionId);
	}
}
