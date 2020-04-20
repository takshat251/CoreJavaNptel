package Lecture3;

import java.util.Scanner;

public class LinearSearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = { 10, 20, 50, 40, 80 };
//		System.out.println("Enter the item to search in linear search");
//		int item= scn.nextInt();
		System.out.println(l(array, 20));

	}

	public static int l(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item)
				return i;

		}
		return -1;
	}

}
