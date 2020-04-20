package Lecture1;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		System.out.println("Write the no.of rows of * pattern");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		while (row <= n) {
			System.out.println("*");
			row++;
		}

	}

}
