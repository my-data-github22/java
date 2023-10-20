package com.app.sunbeam;

import java.util.Scanner;

public class tester implements Arithmetic{
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	@Override
	public double calc(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	static int menu() {
		Scanner sc = new Scanner(System.in);

		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Addition ");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
	
		do {
		choice=menu();
		switch (choice) {
		case 0:System.exit(0);
		case 1:calculate(num1,num2,(a,b)->a+b);
			break;
		case 2:calculate(num1,num2,(a,b)->a-b);
			break;
		case 3:calculate(num1,num2,(a,b)->a*b);
			break;
		case 4:calculate(num1,num2,(a,b)->a/b);

		default:System.out.println("invalid optionss");
			break;
		}
			
		} while (choice!=0);
		

	}

	
	

}
