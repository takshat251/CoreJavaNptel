import java.util.Scanner;

public class ElseifDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		if (age < 11) {
			System.out.println("child");

		} else if (age >= 11 && age < 18) {
			System.out.println("teenager");
		} else if (age >= 18 && age < 75) {
			System.out.println("adult");
		} else {
			System.out.println("gold");

		}

	}
}
