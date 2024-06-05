package com.app.validation;

import java.time.LocalDate;
import java.util.List;

import com.app.Exception.penException;
import com.app.PenStore.PenStore;

public class Validations {

	public static PenStore validatePen( String brandName, String inkColor, String material, String stockListDate,
			 double price, double discount, List<PenStore>list) throws penException {
		LocalDate ListDate =StockDate(stockListDate); 
		return new PenStore( brandName, inkColor, material, ListDate, price, discount);
	}

	private static LocalDate StockDate(String stockDate) throws penException{
		LocalDate date = LocalDate.parse(stockDate);
		return date;
	}
	
	
}
