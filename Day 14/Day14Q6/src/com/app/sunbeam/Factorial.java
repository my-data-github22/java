package com.app.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.:");
		int number=sc.nextInt();
	Stream<Integer>s=Stream.iterate(1, i->i+1)
			.limit(number);
	int res=s.reduce(1, (a,e)->a*e);
	System.out.println(res);
	}

}
