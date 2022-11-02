package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Purchase;
import com.nissan.repo.IPurchaseRepository;


@Service
public class PurchaseServiceImplimentation implements IPurchaseService{
	
	@Autowired
	IPurchaseRepository purchaseRepo;

	@Override
	public List<Purchase>  getAllPurchases() {
		// TODO Auto-generated method stub
		return purchaseRepo.findAll();
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
