package com.JavaPrograms.task;

public class InsrtionSort {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 7, 9, 16, 5 };
		System.out.println("Before Insertation :");
		for (int i : arr) {
			System.out.println(i + " ");

		}

		InsertionSort(arr);

		System.out.println("After Insertation :");
		for (int i : arr) {
			System.out.println(i + " ");

		}
	}

	public static void InsertionSort(int[] arr) {

		int n = arr.length;
		int i, j;
		for (j = 0; j < n; j++) {
			int temp = arr[j];
			i = j - 1;

			while ((i > -1) && (arr[i] > temp)) {
				arr[i + 1] = arr[i];
				i--;

			}
			arr[i + 1] = temp;
		}
	}
}
