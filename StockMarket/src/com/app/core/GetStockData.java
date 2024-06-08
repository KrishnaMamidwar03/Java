package com.app.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GetStockData {
	public static List<Stock> getStock() {
		Stock c1 = new Stock("Tata ST", "Tata", 1000, LocalDate.parse("2015-10-02"), 100);
		Stock c2 = new Stock("Reliance ST", "Reliance", 800, LocalDate.parse("2019-10-02"), 190);
		Stock c3 = new Stock("Mahindra st", "Mahindra", 500, LocalDate.parse("2014-09-02"), 110);
		Stock c4 = new Stock("Bajaj mot", "Bajaj", 600, LocalDate.parse("2013-10-02"), 200);
		Stock c5 = new Stock("Hero Honda st", "Honda", 190, LocalDate.parse("2020-06-02"), 150);
		Stock[] st = { c1, c2, c3, c4, c5 };
		List<Stock> list = new ArrayList<Stock>();

		for (Stock s : st) {
			list.add(s);
		}
		return list;

	}
}
