package com.app.sunbeam;

import java.util.Scanner;

public class Check1 {
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int cnt=0;
		for(T ele:arr) {
			if(c.compare(ele,key))
				cnt++;
		}return cnt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double[]arr= {1.1,1.2,1.2,1.4,1.6,1.8,1.8,1.9};
		Double key=sc.nextDouble();
		int cnt=countIf(arr,key,(e,k)->e.equals(k));
		System.out.println("count is :"+cnt);
	}

}

