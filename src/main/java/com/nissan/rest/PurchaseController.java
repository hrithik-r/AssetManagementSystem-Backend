package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Purchase;
import com.nissan.service.IPurchaseService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class PurchaseController {
	
	@Autowired
	IPurchaseService purchaseService;
	
	@GetMapping("purchases")
	public List<Purchase> getAllPurchases() {
		return purchaseService.getAllPurchases();
	}
	
	@PostMapping("purchase")
	public ResponseEntity<Purchase> addPurchase(@RequestBody Purchase purchase){
		return new ResponseEntity<Purchase> (purchaseService.addPurchase(purchase),HttpStatus.OK);
	}
	
	@PutMapping("purchases")
	public Purchase updatePurchase(@RequestBody Purchase purchase){
		System.out.println("Updating a user record!");
		return purchaseService.updatePurchase(purchase);
	}
	
	@DeleteMapping("purchases/{pdid}")
	public Purchase deleteUser(@PathVariable Integer pdid){
		System.out.println("Deleting a user record!");
		return purchaseService.deleteUser(pdid);
	}

}
