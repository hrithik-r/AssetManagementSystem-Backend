package com.nissan.service;

import java.util.List;

import com.nissan.model.AssetType;
import com.nissan.model.VendorType;
import com.nissan.model.Vendors;

public interface IVendorsService {
	
	//	get all asset types
	List<AssetType> getAllAssetType();
	
	// get all vendors
	List<Vendors> getAllVendors();
	
	// get all vendor Types
	List<VendorType> getAllVendorTypes();
	
	// add new vendor type
	VendorType addVendorType(VendorType vendorType);
	
	// add new vendor
	Vendors addVendor(Vendors vendor);
	
	// update vendor
	Vendors updateVendor(Vendors vendor);
	
	//delete vendor
	void deleteVendor(int vendorId);
	
	// delete vendorType
	void deleteVendorType(int vendorTypeId);

}
