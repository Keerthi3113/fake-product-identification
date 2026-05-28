package com.fakeproduct.model;

public class Product {

    private String productName;
    private String brand;
    private String productCode;
    private String seller;

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getBrand() {
         return brand;
         }
    public void setBrand(String brand) { 
        this.brand = brand; 
    }

    public String getProductCode() { 
        return productCode;
     }
    public void setProductCode(String productCode) { 
        this.productCode = productCode; }

    public String getSeller() { return seller; }
    public void setSeller(String seller) { this.seller = seller; }
}