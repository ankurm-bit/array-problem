package com.minimum.adjacent.difference;

public class MinimumAdjacentDifferrence {

	public void findMinimum(int[] arr, int n) {
       int min = Integer.MAX_VALUE;
       for(int  i = 0 ; i < n-1 ; i++) {
    	   int diff = Math.abs(arr[i+1]-arr[i]);
    	   min = Math.min(min, diff);
       }
       min = Math.min(min, Math.abs(arr[n-1] - arr[0]) );
       System.out.println("Minimum value "+min);
	}

	public static void main(String[] args) {
		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
		int n = arr.length;
		MinimumAdjacentDifferrence differrence = new MinimumAdjacentDifferrence();
		differrence.findMinimum(arr, n);

	}

}
