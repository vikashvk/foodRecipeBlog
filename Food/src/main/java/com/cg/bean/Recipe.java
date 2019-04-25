package com.cg.bean;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int rId;
	private String recipeName;
	private String cuisine;
	private String prepareTime;
	private boolean veg;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String bookName) {
		this.recipeName = bookName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String authorName) {
		this.cuisine = authorName;
	}

	public String getPrepareTime() {
		return prepareTime;
	}

	public void setPrepareTime(String bookPrice) {
		this.prepareTime = bookPrice;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean status) {
		this.veg = status;
	}

	@Override
	public String toString() {
		return "Recipe [bId=" + rId + ", recipeName=" + recipeName + ", cuisine=" + cuisine + ", prepareTime=" + prepareTime
				+ ", type=" + veg + "]";
	}

}
