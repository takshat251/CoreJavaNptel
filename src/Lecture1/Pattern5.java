package Lecture1;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		System.out.println("Enter the no. of rows");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nsp = 0, nst = n;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print('*');
			}
			System.out.println();
			nsp++;
			nst--;
			row++;
		}

	}

}
