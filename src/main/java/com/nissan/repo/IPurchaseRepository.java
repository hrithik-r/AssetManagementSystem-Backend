package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Purchase;

@Repository
public interface IPurchaseRepository extends JpaRepositoryImplementation<Purchase, Integer>{
	
	

}
