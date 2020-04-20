package Lecture6;

import java.util.Scanner;

public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println("Enter y as base ");
		Scanner scn = new Scanner(System.in);
		int y = scn.nextInt();
		System.out.println("Enter m as power ");
		scn = new Scanner(System.in);
		int m = scn.nextInt();
		int ansnon = powernon(y, m);
		int ansrecur = powerrecur(y, m);
		System.out.println("x raise to power n is " + ansrecur);
		System.out.println("x raise to power n is " + ansnon);

	}

	// non recursive method
	public static int powernon(int x, int n) {
		int nm=x;
//		if(n==0)
//			return 1;
//		else if(n==1);
//		return x;
		
		
		while (n > 1) {
			x = x * nm;
			n--;
		}
		return x;
		
	}
	

	// recursive(function calls itself in function definition
	public static int powerrecur(int x, int n) {
		if (n == 0)
			return 1;
		else {
			int pnm = powerrecur(x, n - 1);
			int pn = x * pnm;
			return pn;
		}

	}

}
