package com.example.OnlineLoan.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="item_name")
	private String itemName;
	@Column(name="price")
	private Float price;
	@Column(name="categori_name")
	private String categoriName;
	@Column(name="brand_name")
	private String brandName;
	
	public Item() {
		
	}
	public Item(String itemName, Float price, String categoriName, String brandName) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.categoriName = categoriName;
		this.brandName = brandName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getCategoriName() {
		return categoriName;
	}
	public void setCategoriName(String categoriName) {
		this.categoriName = categoriName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
