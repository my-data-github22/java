package com.app.sunbeam;

import java.util.Comparator;

public class Storebooks {
	private String bn;
	private double price;
	private String authorname;
	private int quantity;

	public String getBn() {
		return bn;
	}

	public void setBn(String bn) {
		this.bn = bn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Storebooks(String bn, double price, String authorname, int quantity) {
		this.bn = bn;
		this.price = price;
		this.authorname = authorname;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Storebooks [bn=" + bn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Storebooks) {
			Storebooks other = (Storebooks) obj;
			if(this.bn.equals(other.bn))
				return true;
		}
		return false;
		
	}
		
	
}
