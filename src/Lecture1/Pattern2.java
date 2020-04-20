package Lecture1;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		System.out.println("Enter no. of rows for pattern");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, col, nst = n;
		while (row <= n) {

			for (col = 1; col <= nst; col++) {
				System.out.print("*");
			}
			System.out.println();
			row++;
			nst--;
		}
	}

}
