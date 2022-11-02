package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.model.AssetType;
import com.nissan.model.VendorType;
import com.nissan.model.Vendors;
import com.nissan.repo.IAssetTypeRepository;
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
	public List<Vendors> getAllVendors() {
		
		return (List<Vendors>)vendorRepo.findAll();
	}

	//get all vendor types
	@Override
	public List<VendorType> getAllVendorTypes() {
		// TODO Auto-generated method stub
		return (List<VendorType>)vendorTypeRepo.findAll();
	}

	
	// add new vendor type
	@Transactional
	@Override
	public VendorType addVendorType(VendorType vendorType) {
		// TODO Auto-generated method stub
		return vendorTypeRepo.save(vendorType);
	}

	
	//add new vendor
	@Transactional
	@Override
	public Vendors addVendor(Vendors vendor) {
		// TODO Auto-generated method stub
		return vendorRepo.save(vendor);
	}

	
	// update vendor
	@Transactional
	@Override
	public Vendors updateVendor(Vendors vendor) {
		// TODO Auto-generated method stub
		return vendorRepo.save(vendor);
	}

	
	// delete vendor
	@Transactional
	@Override
	public void deleteVendor(int vendorId) {
		// TODO Auto-generated method stub
		vendorRepo.deleteById(vendorId);
		
	}

	
	// delete vendor type
	@Override
	public void deleteVendorType(int vendorTypeId) {
		// TODO Auto-generated method stub
		vendorTypeRepo.deleteById(vendorTypeId);
		
	}

	@Autowired
	IAssetTypeRepository assetTypeRepo;
	
	@Override
	public List<AssetType> getAllAssetType() {
		// TODO Auto-generated method stub
		return (List<AssetType>)assetTypeRepo.findAll();
	}

}
