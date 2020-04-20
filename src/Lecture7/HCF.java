import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		System.out.println("enter the divident");
        Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		System.out.println("enter the divisor");
		int divisor = scn.nextInt();
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}
