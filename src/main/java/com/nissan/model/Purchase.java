package com.nissan.model;



import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="tblPurchase")
public class Purchase {
    
    // instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pdId;
    private String pdOrderNo;
    private int assetDefinitionId;
    private int assetTypeId;
    private int pdQty;
    private int vendorId;
    private LocalDate orderDate;
    private Date deliveryDate;
    private String pdStatus;

    // joining asset asset type
    @JoinColumn(name="assetTypeId", insertable = false, updatable = false)
    @ManyToOne
    private AssetType assetType;
    
    // joining asset asset definition
    @JoinColumn(name="assetDefinitionId", insertable = false, updatable = false)
    @ManyToOne
    private AssetDefinition assetDefinition;
    
    // joining
    @JoinColumn(name="vendorId", insertable = false, updatable = false)
    @ManyToOne
    private Vendors vendor;

       public Purchase() {
             super();
       }

       public Purchase(String pdOrderNo, int assetDefinitionId, int assetTypeId, int pdQty, int vendorId,
                    LocalDate orderDate, Date deliveryDate, String pdStatus, AssetType assetType,
                    AssetDefinition assetDefinition, Vendors vendor) {
             super();
             this.pdOrderNo = pdOrderNo;
             this.assetDefinitionId = assetDefinitionId;
             this.assetTypeId = assetTypeId;
             this.pdQty = pdQty;
             this.vendorId = vendorId;
             this.orderDate = orderDate;
             this.deliveryDate = deliveryDate;
             this.pdStatus = pdStatus;
             this.assetType = assetType;
             this.assetDefinition = assetDefinition;
             this.vendor = vendor;
       }

       public int getPdId() {
             return pdId;
       }

       public void setPdId(int pdId) {
             this.pdId = pdId;
       }

       public String getPdOrderNo() {
             return pdOrderNo;
       }

       public void setPdOrderNo(String pdOrderNo) {
             this.pdOrderNo = pdOrderNo;
       }

       public int getAssetDefinitionId() {
             return assetDefinitionId;
       }

       public void setAssetDefinitionId(int assetDefinitionId) {
             this.assetDefinitionId = assetDefinitionId;
       }

       public int getAssetTypeId() {
             return assetTypeId;
       }

       public void setAssetTypeId(int assetTypeId) {
             this.assetTypeId = assetTypeId;
       }

       public int getPdQty() {
             return pdQty;
       }

       public void setPdQty(int pdQty) {
             this.pdQty = pdQty;
       }

       public int getVendorId() {
             return vendorId;
       }

       public void setVendorId(int vendorId) {
             this.vendorId = vendorId;
       }

       public LocalDate getOrderDate() {
             return orderDate;
       }

       public void setOrderDate(LocalDate orderDate) {
             this.orderDate = orderDate;
       }

       public Date getDeliveryDate() {
             return deliveryDate;
       }

       public void setDeliveryDate(Date deliveryDate) {
             this.deliveryDate = deliveryDate;
       }

       public String getPdStatus() {
             return pdStatus;
       }

       public void setPdStatus(String pdStatus) {
             this.pdStatus = pdStatus;
       }

       public AssetType getAssetType() {
             return assetType;
       }

       public void setAssetType(AssetType assetType) {
             this.assetType = assetType;
       }

       public AssetDefinition getAssetDefinition() {
             return assetDefinition;
       }

       public void setAssetDefinition(AssetDefinition assetDefinition) {
             this.assetDefinition = assetDefinition;
       }

       public Vendors getVendor() {
             return vendor;
       }

       public void setVendor(Vendors vendor) {
             this.vendor = vendor;
       }

       @Override
       public String toString() {
             return "Purchase [pdId=" + pdId + ", pdOrderNo=" + pdOrderNo + ", assetDefinitionId=" + assetDefinitionId
                          + ", assetTypeId=" + assetTypeId + ", pdQty=" + pdQty + ", vendorId=" + vendorId + ", orderDate="
                          + orderDate + ", deliveryDate=" + deliveryDate + ", pdStatus=" + pdStatus + ", assetType=" + assetType
                          + ", assetDefinition=" + assetDefinition + ", vendor=" + vendor + "]";
       }
    
    
    
    
}
