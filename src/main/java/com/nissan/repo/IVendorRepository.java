package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Vendors;

@Repository
public interface IVendorRepository extends CrudRepository<Vendors, Integer> {
	
	

}
