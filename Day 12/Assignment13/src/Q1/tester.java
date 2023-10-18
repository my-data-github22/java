package Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class tester {
	static int menu() {
		Scanner sc = new Scanner(System.in);

		int choice;
		System.out.println("0.Exit");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list (hint - Collections.reverseList())");

		choice = sc.nextInt();
		return choice;

//		If book not present, then add a new book (hint - contains())
//		If book is present, increment its quantity.
//		2. Display all books in forward order using random access
//		3. Search a book with given isbn (hint - indexOf())
//		4. Delete a book at given index.
//		5. Delete a book with given isbn.
//		6. Reverse the list (hint - Collections.reverseList())
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int index;
		Library l;
		List<Library> list = new ArrayList<>();

		do {
			choice = menu();
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				l = new Library();
				l.accept();
				if(list.contains(l)) 
				{
					int idx = list.indexOf(l);
					Library lk = list.get(idx);
					lk.setQuantity(lk.getQuantity() + l.getQuantity());
					//list.add(lk);
					break;
				}
				else
					list.add(l);
				break;
			case 2:
				for (Library library : list) {
					System.out.println(library);
				}
				break;
			case 3:
				l = new Library();
				l.accept();
//				String key1 = l.getIsbn();
				index = list.indexOf(l);
				if (index == -1)
					System.out.println(l+ " not found in list.");
				else
					System.out.println(l + " found at index: " + index);
				break;
			case 4:
				index = sc.nextInt();
				list.remove(index);
				System.out.println("After delete");
				for (Library lib : list) {
					System.out.println(lib);
				}
				break;
			case 5:
				l = new Library();
				String key2 = l.getIsbn();
				list.remove(key2);
				System.out.println("After remove");
				for (Library lib : list) {
					System.out.println(lib);
				}
				break;
			case 6:
				Collections.reverse(list);
				for (Library lib : list) {
					System.out.println(lib);
				}
				break;

			default:
				System.out.println("invalid choice.....");
				break;
			}
		} while (choice != 0);
	}
}
