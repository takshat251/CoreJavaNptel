package Lecture3;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-2; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					// swap
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] ar = { 3, 60, 35, 57, 14, 21, 12, 51, 6 };
		System.out.println("aray before sorting");
		for (int k = 0; k < ar.length; k++)
			System.out.print(ar[k] + " ");
		System.out.println();
		bubbleSort(ar);

		// array after sorting
		for (int l = 0; l < ar.length; l++)
			System.out.print(ar[l] + " ");

	}

}
	