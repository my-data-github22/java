package com.app.sunbeam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tester4 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("/home/sunbeam/cpp practise/java_assi/Day15Q3/hello.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
