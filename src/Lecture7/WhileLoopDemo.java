import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
//		introduction to while loop
		int counter = 1;
		while (counter <= 10) {
			System.out.println("Namastey India");
			counter++;
		}
//		print first n natural numbers
		counter = 1;
		while (counter <= 100) {
			System.out.println(counter);
			counter++;
		}
//		sum of first n natural numbers
		int sum = 0;
		int n = 0;
		System.out.println("Enter n to get sum of first n natural numbers");
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		counter = 1;
		while (counter <= n) {
			sum = sum + counter;
			counter++;
		}
		System.out.println("sum of first " + n + " natural no. is " + sum);
//		check the given number is prime or not
		int a = 0;
		int divisor = 1;
		System.out.println("Enter number to check whether it is prime or not");
		
		a = scn.nextInt();
		divisor = 2;
		boolean flag = true;

		while (divisor <= a - 1) {
			if (a % divisor == 0) {
				flag = false;
			}
			divisor++;

		}
		if (flag == true) {
			System.out.println(a + " is a prime number");
		} else {
			System.out.println(a + "is a composite number");
		}

	}
}
