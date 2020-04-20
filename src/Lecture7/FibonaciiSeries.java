import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		System.out.println("Enter the value of n for n th Fibonacii ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int a = 0, b = 1;
		System.out.println("Fibonacii series till " + n + " position is ");
		if (n == 0) {
			System.out.println("0");
		} else if (n == 1) {
			System.out.println("0,1");
		} else {
			System.out.print("0,1,");
			int counter = 2;

			while (counter <= n) {
				sum = a + b;
				System.out.print(sum + ",");
				a = b;
				b = sum;
				counter++;
			}

		}

	}
}