package com.frequencies.limited.range;

public class FrequencyOfLimitedRange {

	public void countOfRange(int [] arr , int n ) {
		for(int i = 0 ; i < n ;i++)
			arr[i] = arr[i] - 1;
		for(int i = 0 ; i <n ; i++)
			arr[arr[i]%n] = arr[arr[i]%n] + n;
		for(int i = 0 ; i <n ;i++)
			arr[i] = arr[i]/n;
		display(arr, n);
	}
	
	public void display(int [] arr , int n) {
		for(Integer i1 : arr)
			System.out.print(i1+" ");
		System.out.println();
	}
	public static void main(String[] args) {
       int [] arr = {2,3,2,3,5};
       int n = arr.length;
       FrequencyOfLimitedRange limitedRange = new FrequencyOfLimitedRange();
       limitedRange.countOfRange(arr, n);
	}

}
