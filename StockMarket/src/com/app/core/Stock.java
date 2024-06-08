package com.app.core;

import java.time.LocalDate;

public class Stock {
	private int id;
	private String stockName;
	private String companyName;
	private double price;
	private LocalDate closingDate;
	private int quantity;
	private static int count=0;

	public Stock(String stockName, String companyName, double price, LocalDate closingDate, int quantity) {
		super();
		this.id = ++count;
		this.stockName = stockName;
		this.companyName = companyName;
		this.price = price;
		this.closingDate = closingDate;
		this.quantity = quantity;
	}
	
	
	

	@Override
	public String toString() {
		return "Stock [id=" + id + ", stockName=" + stockName + ", companyName=" + companyName + ", price=" + price
				+ ", closingDate=" + closingDate + ", quantity=" + quantity + "]";
	}




	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	
	

}
