package appium_stepdefinition;

//write a program in java to perform merge sort on the given array of elements.

import java.util.Arrays;

public class BubblySorting {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 1, 4 };
		System.out.println("Before sorting: " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After sorting: " + Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
