package Q1;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("java test");
		
		System.out.println("enter number");
		num=sc.nextInt();
		System.out.println("binary is"+ Integer.toBinaryString(num));
		System.out.println("octal is"+ Integer.toOctalString(num));
		System.out.println("hexal is"+ Integer.toHexString(num));
	}
}
