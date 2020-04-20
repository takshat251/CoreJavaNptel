package Lecture3;

import java.util.Scanner;

public class BinarySearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = { 10, 33, 55, 74, 75, 84, 99, 111 };
		System.out.println("Enter the item to do binary search");
		int item = scn.nextInt();
		System.out.println("The position of given item is" + binarySearch(arr, item));

	}

	public static int binarySearch(int[] array, int item) {
		int lo = 0, hi = array.length - 1, mid = (lo + hi) / 2;
		while (lo <= hi) {
			if (array[mid] < item) {
				lo = mid + 1;
			} else if (array[mid] > item) {
				hi = mid - 1;
			} else
				return mid;
			mid = (lo + hi) / 2;
		}
		return -1;
	}

}
