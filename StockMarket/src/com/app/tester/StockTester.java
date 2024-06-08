package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.GetStockData;
import com.app.core.Stock;
import static com.app.validate.ValidateStock.*;

public class StockTester {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			boolean exit = false;
			List<Stock> list = new ArrayList<>();
			list = GetStockData.getStock();
			while (!exit) {
				System.out.println("MENU :");
				System.out.println("1.Add new Stock\r\n" + "2.view stocks by company\r\n" + "3.Purchase stocks\r\n"
						+ "4.sell stock\r\n" + "5.display all stocks\r\n" + "0.EXIT");
				System.out.println("enter choice:");

				try {
					switch (scan.nextInt()) {
					case 1:
						System.out.println("1.stock name 2. company name 3. price 4. closing date 5.quantity");
						Stock s = validateStock(scan.next(), scan.next(), scan.nextDouble(), scan.next(),
								scan.nextInt());
						list.add(s);
						System.out.println("stock added !!");
						break;

					case 2:
						System.out.println("enter company name:");
						List<Stock>  l= getCompany(scan.next(), list);
						l.stream().forEach(a -> System.out.println(a));
						break;

					case 3:
						System.out.println("enter the stock id & quantity to purchase"); 
						s = purchaseStocks(scan.nextInt(), scan.nextInt(), list);
						System.out.println(s);
						break; 
						
					case 4:
						System.out.println("enter the stock id & quantity to purchase"); 
						s = sellStocks(scan.nextInt(), scan.nextInt(), list);
						System.out.println(s);
						break;
						
					case 5:
						list.stream().forEach(a -> System.out.println(a));
						break;

					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
