package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.VendorType;

@Repository
public interface IVendorTypeRepository extends CrudRepository<VendorType, Integer> {

	
}
