package Lecture1;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		System.out.println("Enter the value of no. of rows");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nst = 1, nsp = 2 * n - 1;
		while (row <= n) {
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			int val = 1;
			for (int cst =1 ; cst <= nst; cst++) {
				
				System.out.print(val);
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}
			}
			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			row = row + 1;
		}

	}

}
