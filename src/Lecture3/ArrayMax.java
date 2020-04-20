package Lecture3;

import java.util.Scanner;

public class ArrayMax {
	static Scanner scn = new Scanner(System.in);
	public static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		int[] array = takeInput();
		
		display(array);
		System.out.println("max of array is " + max(array));

	}

	public static int[] takeInput() {
		System.out.println("size ?");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for" + i + "index");
			arr[i] = scn.nextInt();
		}
		return arr;

	}

	public static void display(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

	public static int max(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			if (max < arr[k])
				max = arr[k];
		}
		return max;

	}

}
