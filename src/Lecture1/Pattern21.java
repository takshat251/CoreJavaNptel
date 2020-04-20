package Lecture1;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows for pattern");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
// row
		int row = 1, nst = 1, ns = 2 * n - 1, nsp = 2 * n - 3;
		while (row <= n) {
//work
			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print('*');
				cst++;
			}
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// stars
			cst = 1;
			if (row == n) {
				cst = 2;
			}
			while (cst <= nst) {
				System.out.print('*');
				cst++;
			}
// preparation
			nst = nst + 1;
			nsp = nsp - 2;

			System.out.println();

			row = row + 1;
		}

	}

}
