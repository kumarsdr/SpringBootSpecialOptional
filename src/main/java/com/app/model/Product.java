package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prodtabseven")
public class Product {
	
	@Id
	private Integer prodId;
	private String prodMode;
	private String prodCode;
	private String prodVendor;
	private Double prodCost;
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodMode, String prodCode, String prodVendor, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodMode = prodMode;
		this.prodCode = prodCode;
		this.prodVendor = prodVendor;
		this.prodCost = prodCost;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdMode() {
		return prodMode;
	}
	public void setProdMode(String prodMode) {
		this.prodMode = prodMode;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodMode=" + prodMode + ", prodCode=" + prodCode + ", prodVendor="
				+ prodVendor + ", prodCost=" + prodCost + "]";
	}
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}
	public Product get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

