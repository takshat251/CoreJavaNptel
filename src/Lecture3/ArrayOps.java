package Lecture3;

import java.util.Scanner;

public class ArrayOps {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = takeInput();
		display(array);

	}

	public static int[] takeInput() {
		System.out.println("Size?");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for " + i + "index ?");
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
