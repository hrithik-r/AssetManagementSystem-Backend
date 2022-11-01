package com.nissan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.VendorType;
import com.nissan.model.Vendors;
import com.nissan.repo.IVendorRepository;
import com.nissan.repo.IVendorTypeRepository;

@Service
public class VendorsServiceImpl implements IVendorsService {
	
	// DI Injection
	@Autowired
	IVendorRepository vendorRepo;
	
	// DI Injection
	@Autowired
	IVendorTypeRepository vendorTypeRepo;

	// get all vendors
	@Override
	public Vendors getAllVendors() {
		// TODO Auto-generated method stub
		return null;
	}

	//get all vendor types
	@Override
	public VendorType getAllVendorTypes() {
		// TODO Auto-generated method stub
		return null;
	}

}
