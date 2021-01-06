package com.equilibrim.point;

public class EquilibriumPoint {

	public void getEquilibriumPoint(int[] arr, int n) {
		int i = 0, j = n - 1, leftSum = 0, rightSum = 0;
		while (i < n && j > 0) {
			leftSum += arr[i];
			rightSum += arr[j];
			if (leftSum == rightSum) {
				System.out.println("Equilibrium Point " + (i + 1));
				return;
			}
			i++;
			j--;
		}
		System.out.println("There is no equilibrium Point");
	}

	public static void main(String[] args) {
		int[] arr = {1};
		int n = arr.length;
		EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
		equilibriumPoint.getEquilibriumPoint(arr, n);
	}

}
