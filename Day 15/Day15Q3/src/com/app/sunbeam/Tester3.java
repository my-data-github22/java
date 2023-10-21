package com.app.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Tester3 {
public static void main(String[] args) {
	try(FileWriter fw = new FileWriter("hello.txt")){
		try(BufferedWriter bw = new BufferedWriter(fw)){
			for(int i=0;i<4;i++) {
				System.out.println("Enter line");
				Scanner sc = new Scanner(System.in);
				String line = sc.nextLine();
				bw.write(line);
				bw.newLine();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
