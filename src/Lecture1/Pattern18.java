package Lecture1;

import java.sql.Time;
import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows(odd) for pattern");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, nsp = n/2, row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print('*');
				cst++;
			}
			if (row <= n / 2) {
				nst = nst + 2;
				nsp--;
			} else {
				nst = nst - 2;
				nsp++;
			}
			System.out.println();

			row = row + 1;
		}

	}

}
