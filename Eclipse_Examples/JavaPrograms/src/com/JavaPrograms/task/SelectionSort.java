package com.JavaPrograms.task;

public class SelectionSort {
	static int i;

	public static void main(String[] args) {
		int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14 };
		System.out.println("Before SelctionSort:");

		for (int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		selectionSort(arr);
		System.out.println("After SelctionSort:");

		for (int i : arr) {
			System.out.println(i + " ");
		}

	}

	private static void selectionSort(int[] arr) {
		int i, j;
		int n = arr.length;
		int index = 0;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n - 1; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest array

				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

	}

}
