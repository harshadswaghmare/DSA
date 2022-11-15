package BubbleSort;

import java.util.Scanner;

public class Sorting {

	// Bubble sort

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}

	}

	// selection sort

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)

		{
			int smallest = i;
			for (int j = i + 1; j < arr.length - 1; j++) {

				if (arr[smallest] > arr[j]) {
					smallest = j;
				}

			}

			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;

		}
	}

	// Print array
	public static void printarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = sc.nextInt();
		int[] arr = new int[a];
		int i = 0;
		System.out.println("enter the no into the array" + ",");
		for (i = 0; i < arr.length; i++) // adding the element into the array
		{
			arr[i] = sc.nextInt();

		}

		// print array elements

		System.out.println("Before sorting array elements are:");
		for (int elements : arr) {
			System.out.print(elements + " ");
		}
		System.out.println();
		System.out.println("after sorting elements are :");
		bubbleSort(arr); // calling of bubble sort
		printarray(arr);
		System.out.println();
		System.out.println("Array after Selection sort");
		selectionSort(arr); // calling of selection sort
		printarray(arr);

	}

}
