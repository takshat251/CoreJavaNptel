package Lecture1;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

		System.out.println("Enter the no. of rows");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = n - 1, nst = 1, row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nsp--;
			nst++;
			row++;
		}

	}

}
