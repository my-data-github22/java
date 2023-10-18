package Q1;

import java.util.Objects;
import java.util.Scanner;

public class Library {

	private String isbn;
	private double price;
	private String authorname;
	private int quantity;
	Scanner sc = new Scanner(System.in);

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept() {
		System.out.println("Add new book");
		System.out.println("Enter isbn :");
		this.isbn = sc.nextLine();
		System.out.println("Enter price :");
		this.price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter author name");
		this.authorname = sc.nextLine();
		System.out.println("Enter Quantity");
		this.quantity = sc.nextInt();

	}

	public Library() {

	}

	public Library(String isbn, double price, String authorname, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorname = authorname;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", price=" + price + ", authorname=" + authorname + ", quantity=" + quantity
				+ "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(isbn, other.isbn);
	}

}
