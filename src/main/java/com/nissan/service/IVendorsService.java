package com.nissan.service;

import com.nissan.model.VendorType;
import com.nissan.model.Vendors;

public interface IVendorsService {
	
	// get all vendors
	Vendors getAllVendors();
	
	// get all vendor Types
	VendorType getAllVendorTypes();

}
