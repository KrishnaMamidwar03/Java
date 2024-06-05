package com.app.PenStoreApp;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.PenStore.PenStore;
import com.app.validation.UpdatePen;
import com.app.validation.Validations;

public class PenStoreApp {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			boolean exit = false;
			List<PenStore> list = new ArrayList<>();

			while (!exit) {
				System.out.println("menu:");
				System.out.println("1. Add new Pen\r\n" + "2. Update stock of a Pen\r\n"
						+ "3.Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
						+ "4. Remove Pens which are never sold once listed in 9 months\r\n" + "5.show all list\r\n"
						+ "0. exit");

				System.out.println("enter your choice : ");
				int choice = scan.nextInt();

				try {
					switch (choice) {
					case 0:
						System.out.println("exit from app");
						exit = true;
						break;

					case 1:
						System.out.println("enter pen details:");
						System.out.println("2.brand 3.inkColor 4.material 5.stockList Date 6.Price 7.discount");
						PenStore pen = Validations.validatePen( scan.next(), scan.next(), scan.next(),
								scan.next(), scan.nextDouble(), scan.nextDouble(), list);
						list.add(pen);
						System.out.println("data added succesfully!!");
						break;

					case 2:
						System.out.println("enter id to updaate data");
						pen = UpdatePen.UpdateStock(scan.nextInt(), list);
						System.out.println("enter pen color & material to update ");
						pen.setInkColor(scan.next());
						pen.setMaterial(scan.next());
						break;
					
					case 3:
						
						for(PenStore p : list) {
						int month = Period.between(p.getStockListDate(), LocalDate.now()).getMonths();
						 
							if(month>3) {
								p.setDiscount(20);
							}else {
								System.out.println("No stack available before 3 months");
							}
						}
						
						
						break;
						
					case 4:
						for(PenStore p : list) {
							int month = Period.between(p.getStockListDate(), LocalDate.now()).getMonths();
							 
								if(month>9) {
								   list.remove(p);
								}else {
									System.out.println("No stack available before 9"
											+ " months");
								}
							}
						
						break;

					case 5:
						System.out.println("list of all pens");
						for (PenStore pp: list) {
							System.out.println(pp);
						}
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
