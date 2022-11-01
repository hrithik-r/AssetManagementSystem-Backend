package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vendors")
public class Vendors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;
	
	private String vendorName;
	
	private int vendorTypeId;
	
	// many vendors have one role
	@JoinColumn(name="vendorTypeId", insertable=false, updatable=false) // vendor.vendorTypeId = vendorYtpe.vendorTypeId
	@ManyToOne
	private VendorType vendorType;
	
//	private int assetTypeId;
	
	private LocalDate validFrom;
	
	private LocalDate validTo;
	
	private String address;
	
	
	

}
