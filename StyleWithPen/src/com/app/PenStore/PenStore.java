package com.app.PenStore;

import java.time.LocalDate;

public class PenStore {

	private int Id;
	private String brandName;
	private String InkColor;
	private String Material;
	private LocalDate stockListDate;
	private LocalDate stockUpdateDate;
	private double price;
	private double discount;
	private static int count = 0;

	public PenStore( String brandName, String inkColor, String material, LocalDate stockListDate, double price,
			double discount) {
		super();
		this.Id = ++count;
		this.brandName = brandName;
		this.InkColor = inkColor;
		this.Material = material;
		this.stockListDate = stockListDate;
		this.stockUpdateDate = LocalDate.now();
		this.price = price;
		this.discount = discount;
	}

	

	@Override
	public String toString() {
		return "PenStore [Id=" + Id + ", brandName=" + brandName + ", InkColor=" + InkColor + ", Material=" + Material
				+ ", stockListDate=" + stockListDate + ", stockUpdateDate=" + stockUpdateDate + ", price=" + price
				+ ", discount=" + discount + "]";
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getInkColor() {
		return InkColor;
	}

	public void setInkColor(String inkColor) {
		InkColor = inkColor;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public LocalDate getStockListDate() {
		return stockListDate;
	}

	public void setStockListDate(LocalDate stockListDate) {
		this.stockListDate = stockListDate;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
