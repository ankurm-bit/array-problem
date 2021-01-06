package com.segregate;

public class NegativePositiveSegregation {

	public int[] segregateNumber(int[] arr, int n) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		display(arr, n);
		return arr;
	}

	public void display(int[] arr, int n) {
		for (int number : arr) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		int[] arr = { 10, -2, 12, -6, -1, 8 };
		int [] arr = {-12,11,-13,-5,6,-7,5,-3,-6};
		int n = arr.length;
		NegativePositiveSegregation segregation = new NegativePositiveSegregation();
		segregation.segregateNumber(arr, n);
	}

}
