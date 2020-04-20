package Lecture3;

import java.util.Scanner;

public class FunctionOperations {
	public static void main(String[] args) {
		System.out.println("Welcome to Anybase to Decimal Converter\nEnter source number");
		Scanner scn = new Scanner(System.in);
		int sno = scn.nextInt();
		System.out.println("Enter source base");
		scn = new Scanner(System.in);
		int sbno = scn.nextInt();
		int dstno = AnyBaseToDecimal(sno, sbno);
		System.out.println(dstno);

	}

	public static int AnyBaseToDecimal(int sn, int sb) {
		int dst = 0, mult = 1;
		while (sn != 0) {
			int rem = sn % 10;

			dst = dst + rem * mult;
			mult = mult * sb;
			sn = sn / 10;
		}
		
		return dst;

	}
}
