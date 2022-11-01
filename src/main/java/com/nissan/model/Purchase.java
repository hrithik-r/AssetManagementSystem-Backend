package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tblPurchase")
public class Purchase {
	
	// instance variables
	private int pdId;
	private String pdOrderNo;
	private long pdAssetId;
	private int pdTypeId;
	
	

}
