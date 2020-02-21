package jtm.tasks.fundamentals;

import java.util.Arrays;

public class EqualSidesArray {

	/*
	 * TODO
	 * 
	 * You are going to be given an array of integers. Your job is to take that
	 * array and find an index N where the sum of the integers to the left of N is
	 * equal to the sum of the integers to the right of N. If there is no index that
	 * would make this happen, return -1.
	 * 
	 * {1,2,3,4,3,2,1}: Correct answer 3, because at the 3rd position of the array,
	 * the sum of left side of the index ({1,2,3}) and the sum of the right side of
	 * the index ({3,2,1}) both equal 6.
	 * 
	 * {1,100,50,-51,1,1}: Correct answer 1, because at the 1st position of the
	 * array, the sum of left side of the index ({1}) and the sum of the right side
	 * of the index ({50,-51,1,1}) both equal 1.
	 * 
	 * {20,10,-80,10,10,15,35} At index 0 the left side is {} The right side is
	 * {10,-80,10,10,15,35} They both are equal to 0 when added. (Empty arrays are
	 * equal to 0 in this problem) Index 0 is the place where the left side and
	 * right side are equal.
	 * 
	 * If you are given an array with multiple answers, return the lowest correct
	 * index.
	 */

	public static int findEvenIndex(int[] arr) {
		int [] result  = new int [arr.length] ;
		int finalResult = -1;
		
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int sumRight = 0;

			for (int j = i + 1; j < arr.length; j++) {
				sumRight = sumRight + arr[j];
			}			

			int sumLeft = 0;

			for (int j = i - 1; j >= 0; j--) {
				sumLeft = sumLeft + arr[j];
			}

			System.out.print(sumRight + " ");
			System.out.print(sumLeft + " ");
			System.out.println(i+ " ");

			if (sumLeft == sumRight) {
				result[i] = i;
				System.out.print(i + " ");
				System.out.println(Arrays.toString(result));			
			}
			else {
				result[i]=-1;
			}			
		}
		
		 for (int a=0; a<arr.length; a++ ) {
			 if (result[a] != -1) {
				 finalResult = result[a];
			 }
			
		 }
		System.out.println(Arrays.toString(result));
		return finalResult;
	}
}
