package com.app.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


import java.util.Iterator;
import java.util.List;

public class tester {
	static int menu() {
		Scanner sc = new Scanner(System.in);

		int choice;
		System.out.println("0.Exit");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Delete at book given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order ");
		choice = sc.nextInt();
		return choice;
	}


	public static void main(String[] args) {
		int choice;
		List<Storebooks> a = new ArrayList<>();

		while (true) {
			choice = menu();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				a.add(new Storebooks("chava", 50.5, "smb", 5));
				a.add(new Storebooks("shivaji", 60.5, "bmb", 4));
				a.add(new Storebooks("maratha", 70.5, "omb", 3));
				a.add(new Storebooks("yayati", 80.5, "mbb", 2));
				break;
			case 2:
				for (Storebooks ele : a) {
					System.out.println(ele);
				}
				break;
			case 3:
				a.remove(0);
				System.out.println("after delete :");
				for (Storebooks ele : a) {
					System.out.println(ele);
				}

				break;
			case 4:
				Storebooks key1 = new Storebooks("yayati", 80.5, "mbb", 2);
				if (a.contains(key1))
					System.out.println("\n" + key1.getBn() + " is bn present in list");
				else
					System.out.println("\n" + key1 + "not in list");
				break;
			case 5:a.clear();
				break;
			case 6:System.out.println("list contains :" + a.size()+"books");
				break;
			case 7:
				class PriceComparator implements Comparator<Storebooks>{

					@Override
					public int compare(Storebooks s1, Storebooks s2) {
						int diff =-( Double.compare(s1.getPrice(), s2.getPrice()));
						return diff;
					}
					
				}

				PriceComparator p = new PriceComparator();
				a.sort(p);
				break;

			default:System.out.println("invalid choice.....");
				break;
			}
		}
	}

}
