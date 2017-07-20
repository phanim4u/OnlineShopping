package com.proj.onlineshopping.model;

import com.proj.onlineshopping.entity.Product;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class ProductInfo {
	
	private String code;
    private String name;
    private double price;
    private double prodQty;
     
    private boolean newProduct=false;
 
    // Upload file.
    private CommonsMultipartFile fileData;
 
    public ProductInfo() {
    }
 
    public ProductInfo(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
        this.prodQty=product.getProdQty();
       
    }
 
    public ProductInfo(String code, String name, double price, double prodQty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.prodQty = prodQty;
    }
 
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
    
    
 
    /**
	 * @return the prodQty
	 */
	public double getProdQty() {
		return prodQty;
	}

	/**
	 * @param prodQty the prodQty to set
	 */
	public void setProdQty(double prodQty) {
		this.prodQty = prodQty;
	}

	public CommonsMultipartFile getFileData() {
        return fileData;
    }
 
    public void setFileData(CommonsMultipartFile fileData) {
        this.fileData = fileData;
    }
 
    public boolean isNewProduct() {
        return newProduct;
    }
 
    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }

}
