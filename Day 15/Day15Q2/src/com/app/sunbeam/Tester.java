package com.app.sunbeam;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {
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
		System.out.println("8. Save books from file");
		System.out.println("9. Load books from file");
		choice = sc.nextInt();
		return choice;
	}


	public static void main(String[] args) {
		int choice;
		List<Books> a = new ArrayList<>();

		while (true) {
			choice = menu();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				a.add(new Books("chava", 50.5, "smb", 5));
				a.add(new Books("shivaji", 60.5, "bmb", 4));
				a.add(new Books("maratha", 70.5, "omb", 3));
				a.add(new Books("yayati", 80.5, "mbb", 2));
				break;
			case 2:
				for (Books ele : a) {
					System.out.println(ele);
				}
				break;
			case 3:
				a.remove(0);
				System.out.println("after delete :");
				for (Books ele : a) {
					System.out.println(ele);
				}

				break;
			case 4:
				Books key1 = new Books("yayati", 80.5, "mbb", 2);
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
				class PriceComparator implements Comparator<Books>{

					@Override
					public int compare(Books s1, Books s2) {
						int diff =-( Double.compare(s1.getPrice(), s2.getPrice()));
						return diff;
					}
					
				}

				PriceComparator p = new PriceComparator();
				a.sort(p);
				break;
				
			case 8:try(FileOutputStream fout = new FileOutputStream("Books.java")){
				try(ObjectOutputStream oout = new ObjectOutputStream(fout)){
					oout.writeObject(a);
						
				}// dout.close();
			}// fout.close();
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("file is saved");
			break;
			
			case 9:List<Books> list;
				try(FileInputStream fin = new FileInputStream("Books.java")){
					try(ObjectInputStream oin = new ObjectInputStream(fin)){
						list=(List<Books>)oin.readObject();
						list.forEach(b -> System.out.println(b));
						}
					}
			
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("File loaded");
				break;

			default:System.out.println("invalid choice.....");
				break;
			}
		}
	}

}
