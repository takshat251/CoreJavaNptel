package Lecture1;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		System.out.println("Enter the no. of rows(odd) for pattern");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n / 2, nsp = 1, row = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print('*');
				cst++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			cst = 1;
			while (cst <= nst) {
				System.out.print('*');
				cst++;
			}
			if (row <= n / 2) {
				nsp = nsp + 2;
				nst = nst - 1;
			} else {
				nsp = nsp - 2;
				nst = nst + 1;
			}
			System.out.println();

			row = row + 1;
		}

	}

}
