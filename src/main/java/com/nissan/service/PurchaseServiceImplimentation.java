package com.nissan.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nissan.model.Purchase;
import com.nissan.model.User;
import com.nissan.repo.IPurchaseRepository;

public class PurchaseServiceImplimentation implements IPurchaseService{
	
	@Autowired
	IPurchaseRepository purchaseRepo;

	@Override
	public Purchase getAllPurchases() {
		// TODO Auto-generated method stub
		return (Purchase) purchaseRepo.findAll();
	}

	@Override
	public Purchase addPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		return purchaseRepo.save(purchase);
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		return purchaseRepo.save(purchase);
	}

	@Override
	public Purchase deleteUser(Integer pdId) {
		purchaseRepo.deleteById(pdId);
		return null;
	}


}
