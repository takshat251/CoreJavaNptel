package Lecture3;

import java.util.Scanner;

public class FunctionOperation2 {
	public static void main(String[] args) {
		System.out.println("Welcome to  Decimal to anybase Converter\nEnter source number");
		Scanner scn = new Scanner(System.in);
		int sno = scn.nextInt();
		System.out.println("Enter destination base");
		scn = new Scanner(System.in);
		int dstbno = scn.nextInt();
		int dstno = DecimalToAnybase(sno, dstbno);
		System.out.println(dstno);

	}

	public static int DecimalToAnybase(int sn, int dstb) {
		int dst = 0, mult = 1;
		while (sn != 0) {
			int rem = sn % dstb;

			dst = dst + rem * mult;
			mult = mult * 10;
			sn = sn / dstb;
		}

		return dst;

	}
}
