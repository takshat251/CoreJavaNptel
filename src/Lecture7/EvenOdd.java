import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n % 2 == 0) {
			System.out.println("even is" + n);

		} else {
			System.out.println("odd is" + n);

		}

	}
}