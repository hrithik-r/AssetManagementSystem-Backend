package com.nissan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nissan.model.Purchase;
import com.nissan.model.User;

@Service
public interface IPurchaseService {

	List<Purchase>  getAllPurchases();

	Purchase addPurchase(Purchase purchase);

	Purchase updatePurchase(Purchase purchase);

	Purchase deleteUser(Integer pdId);

}
