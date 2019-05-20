package edu.mum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Menu Id")
	private Long menuId;
	
	@Column(name = "Menu Name")
	private String menuName;
	
	@Column(name = "Menu Category")
	private MenuCategory category;
	
	@Column(name = "Description")
	private String description;	// Contents or ingredients
	
	@Column(name = "Price")
	private double price;


	public MenuCategory getCategory() {
		return category;
	}


	public void setCategory(MenuCategory category) {
		this.category = category;
	}


	public Long getMenuId() {
		return menuId;
	}


	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}


	public String getMenuName() {
		return menuName;
	}


	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
