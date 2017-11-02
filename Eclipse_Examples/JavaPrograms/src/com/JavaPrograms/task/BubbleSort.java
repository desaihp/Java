package com.JavaPrograms.task;

public class BubbleSort {

	static int i, j;

	public static void main(String[] args) {
		int arr[] = { 1, 5, 854, 12, 11, 10 };

		System.out.println("Before the BubbleSort:");

		for (i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);// after the sorting the array

		System.out.println("After the BubbleSort");

		for (i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}
	}

	private static void bubbleSort(int[] arr) {

		int n = arr.length;
		int temp = 0;
		for (i = 0; i < n; i++) {
			for (j = 1; j < (n - i); j++) {

				if (arr[j - 1] > arr[j]) {
					// swap element
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
