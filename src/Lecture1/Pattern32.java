package Lecture1;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		System.out.println("Enter the order of pattern");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1, nst = 1;
		int val=1;
		while (row <= 2*n-1) {
			
			
			for (int cst = 1; cst <= nst; cst++) {
				if (cst % 2 != 0)
					System.out.print(val);
				else
					System.out.print('*');
				
			}
			if(row<n)
				val++;
			else
				val--;
			
			System.out.println();
			if (row<n)
				nst += 2;
			else
				nst -=2;
			row++;;
		}

	}

}
