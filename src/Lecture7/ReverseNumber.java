import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();

		int reverse = 0;
		while (number != 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;

			number = number / 10;

		}
		System.out.println(reverse);

	}

}
