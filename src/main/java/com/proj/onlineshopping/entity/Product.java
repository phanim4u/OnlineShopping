package com.proj.onlineshopping.entity;

import java.io.Serializable;
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Products")
public class Product implements Serializable {
	
	private static final long serialVersionUID = -1000119078147252957L;
	 
    private String code;
    private String name;
    private double price;
    private double prodQty;
    private byte[] image;
 

	// For sort.
    private Date createDate;
 
    public Product() {
    }

	/**
	 * @return the code
	 */
    @Id
    @Column(name = "Code", length = 20, nullable = false)
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	@Column(name = "Name", length = 255, nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	@Column(name = "Price", nullable = false)
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the prodQty
	 */
	@Column(name = "Product_Quantity", nullable = false)
	public double getProdQty() {
		return prodQty;
	}

	/**
	 * @param prodQty the prodQty to set
	 */
	public void setProdQty(double prodQty) {
		this.prodQty = prodQty;
	}

	/**
	 * @return the image
	 */
	 @Lob
	 @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}

	/**
	 * @return the createDate
	 */
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Create_Date", nullable = false)
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
    

}
