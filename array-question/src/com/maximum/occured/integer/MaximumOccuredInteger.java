package com.maximum.occured.integer;

import java.util.Arrays;

public class MaximumOccuredInteger {
	
	public void getMaximumInteger(int [] arr , int [] brr , int n ) {
		int first = greaterElementInArray(arr, n);
		int sec = greaterElementInArray(brr, n);
		int size ; 
		if(first>sec)
			size = first ;
		else 
			size = sec;
		int [] newarr = new int [size+1];
		Arrays.fill(newarr, 0);
		for(int i = 0 ; i <n;i++) {
			for(int j = arr[i] ; j <= brr[i];j++) {
				newarr[j] = newarr[j]+1;
			}
		}
		
		int max = Integer.MIN_VALUE , j=0 ;
		for(int i =0;i<newarr.length;i++ ) {
			if(newarr[i]>max)
				j  = i;
			max = Math.max(max, newarr[i]);
		}
		System.out.println("Maximum Occured Integer "+j);
	}
	
	public int greaterElementInArray(int [] arr ,  int n ) {
		int max = arr[0];
		for(int i = 1 ; i <n ;i++)
			max = Math.max(arr[i],max);
		return max;
	}

	public static void main(String[] args) {
		int [] arr = {1,5,9,13,21};
		int [] brr = {15,8,12,20,30};
		int n = arr.length;
		MaximumOccuredInteger integer = new MaximumOccuredInteger();
		integer.getMaximumInteger(arr, brr, n);

	}

}
