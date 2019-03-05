package com.cts.grizzlystore.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

	private String categoryId;
	private String name;
	
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + "]";
	}
	
	public Category(String categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}
	@Id
	@Column
	public String getcategoryId() {
		return categoryId;
	}
	public void setcategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
