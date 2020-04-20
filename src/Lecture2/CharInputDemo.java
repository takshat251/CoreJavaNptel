package Lecture2;

import java.util.Scanner;

public class CharInputDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Character");
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if (65 <= ch && ch <= 'Z')
			System.out.println("Upper case");
		else if ('a' <= ch && ch <= 122)
			System.out.println("Lower case");
		else
			System.out.println("Invalid character");

	}

}
