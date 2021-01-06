package com.majority;

public class MajorityElement {

	public void majorityElement(int[] arr, int n, int x, int y) {
		int counterX = 0, counterY = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				counterX++;
			if (arr[i] == y)
				counterY++;
		}
		if (counterX > counterY)
			System.out.println(counterX);
		else if (counterY > counterX)
			System.out.println(counterY);
		else {
			if (x < y)
				System.out.println(x);
			else
				System.out.println(y);
		}
	}

	public static void main(String[] args) {
       int [] arr = {5, 22 ,29, 12 ,32, 69, 1 ,75};
       int n = arr.length;
       MajorityElement element = new MajorityElement();
       int x = 29 , y = 96 ;
       element.majorityElement(arr, n, x, y);
	}

}
