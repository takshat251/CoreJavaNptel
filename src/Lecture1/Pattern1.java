package Lecture1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Enter the order of * pattern");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int col,nst=1;
		while (row <= n) {
			
			for (col = 1; col <= nst; col++) {
				System.out.print("*");
			}
			System.out.println("\n");
			row++;
			nst=row;
		}

	}

}
