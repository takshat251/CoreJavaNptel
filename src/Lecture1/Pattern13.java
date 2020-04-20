package Lecture1;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		System.out.println("Enter the value of n for pattern");
		{
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int row = 1, nst = 1;
			while (row <= 2 * n - 1) {
				if (row <= n) {
					for (int cst = 1; cst <= nst; cst++) {
						System.out.print('*');
					}
					nst++;
				} else {
					for (int cst = 1; cst <= nst - 2; cst++) {
						System.out.print('*');
					}
					nst--;
				}
				System.out.println();
				row++;
			}
		}

	}

	}






