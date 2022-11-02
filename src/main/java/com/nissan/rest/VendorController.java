package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.AssetType;
import com.nissan.model.VendorType;
import com.nissan.model.Vendors;
import com.nissan.service.IVendorsService;

@RestController
@CrossOrigin
@RequestMapping("api/vendor/")
public class VendorController {
	
	// DI injection
	@Autowired
	IVendorsService vendorsService;
	
	//testing
	@GetMapping("/s")
	public String check(){
		return "It's Working";
	}
	
	// get all vendors
	@GetMapping("/")
	public List<Vendors> getAllVendors(){
		return vendorsService.getAllVendors();
	}
	
	// get all vendors type
	@GetMapping("/type")
	public List<VendorType> getAllVendorType(){
		System.out.println("Getting all vendor types");
		return vendorsService.getAllVendorTypes();
	}
	
	// add new Vendor type
	@PostMapping("/")
	public Vendors addVendor(@RequestBody Vendors vendor) {
		return vendorsService.addVendor(vendor);
	}
	
	// add new Vendor type
	@PostMapping("/type")
	public VendorType addVendorType(@RequestBody VendorType vendorType) {
		return vendorsService.addVendorType(vendorType);
	}
	
	
	// update vendor
	@PutMapping("/")
	public Vendors updateVendor(@RequestBody Vendors vendor) {
		return vendorsService.updateVendor(vendor);
	}
	
	
	// delete vendor 
	@DeleteMapping("delete/{vendorId}")
	public void deleteVendor(@PathVariable int vendorId) {
		System.out.println(vendorId);
		vendorsService.deleteVendor(vendorId);
	}
	
	
	// delete vendor 
	@DeleteMapping("/delete/type/{vendorTypeId}")
	public void deleteVendorType(@PathVariable int vendorTypeId) {
		vendorsService.deleteVendorType(vendorTypeId);
	}
	
	
	
	@GetMapping("/assettype")
	public List<AssetType> getAllAssetType(){
		return vendorsService.getAllAssetType();
	}
	
	
	
	

}
