package com.app.validate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.Exception.stockExc;
import com.app.core.Stock;

public class ValidateStock {

	public static Stock validateStock(String sname, String cname, double price, String Dt, int qty) throws stockExc {
		LocalDate dt = LocalDate.parse(Dt);
		return new Stock(sname, cname, price, dt, qty);

	}
	
	
	public static List<Stock> getCompany(String cname, List<Stock>list)throws stockExc{
		List<Stock>l = new ArrayList<Stock>();
		for(Stock s:list) {
			if(s.getCompanyName().toUpperCase().equals(cname.toUpperCase())) 
				l.add(s);	
		}
		 if (l.isEmpty()) {
		        throw new stockExc("Such stock is not available!");
		    }
		return l;
	}
	
	//purchase stocks
	public static Stock purchaseStocks(int id, int qty, List<Stock>list)throws stockExc{
		for(Stock s: list) {
			if(s.getId()==id && s.getQuantity()>=qty) {
				int x=s.getQuantity()-qty;
				s.setQuantity(x);
				return s;
			}
		}
		throw new stockExc("stocks not available!!!");
	
	}
	
	
	public static Stock sellStocks(int id, int qty, List<Stock>list)throws stockExc{
		for(Stock s: list) {
			if(s.getId()==id ) {
				int x=s.getQuantity()+qty;
				s.setQuantity(x);
				return s;
			}
		}
		throw new stockExc("stocks not available!!!");
	
	}

}
