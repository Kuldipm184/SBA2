package com.eval.coronakit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class ProductMaster {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="productname")
	@NotBlank()
	@Size(min = 2,max=20,message = "Product name must not be empty and should have min 2 chars")
	private String productName;
	
	
	
	@Column(name="cost")
	@Min(value = 10,message = "Cost Price can not be zero or negative")	
	private Integer cost;
	
	@Column(name="productdescription")
	@NotBlank()
	@Size(min = 5,message = "Product Description must not be empty and should have min 5 chars")
	private String productDescription;
	
	public ProductMaster() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductMaster(int id, String productName, Integer cost, String productDescription) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.productDescription = productDescription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "ProductMaster [id=" + id + ", productName=" + productName + ", cost=" + cost + ", productDescription="
				+ productDescription + "]";
	}

}

	

