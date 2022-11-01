package com.nissan.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.Purchase;

public interface IPurchaseRepository extends JpaRepositoryImplementation<Purchase, Integer>{

}
