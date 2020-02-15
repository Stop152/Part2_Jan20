package jtm.tasks.fundamentals;

import jtm.activity03.Array;

import java.util.Arrays;

public class SupermarketQueue {

	/*
	 * TODO There is a queue for the self-checkout tills at the supermarket. Your
	 * task is write a function to calculate the total time required for all the
	 * customers to check out!
	 * 
	 * Input: customers: an array of positive integers representing the queue. Each
	 * integer represents a customer, and its value is the amount of time they
	 * require to check out. n: a positive integer, the number of checkout tills.
	 * Output The function should return an integer, the total time required.
	 * 
	 * Examples: queueTime([5,3,4], 1) => should return 12 Because when there is 1
	 * till, the total time is just the sum of the times
	 * 
	 * queueTime([10,2,3,3], 2) => should return 10 Because here n=2 and the 2nd,
	 * 3rd, and 4th people in the queue finish before the 1st person has finished.
	 * 
	 * queueTime([2,3,10], 2) => should return 12
	 * 
	 */

	public static int solveSuperMarketQueue(int[] customers, int n) {

		int time = 0;
		int min = 0;
		int i = 0;
		
		System.out.println(Arrays.toString(customers) + "beginning");
		System.out.println(n);

		int[] cashTime = new int[n];

		if (n == 1) {
			for (int u = 0; u < customers.length; u++) {
				time = time + customers[u];
			}
			System.out.println(time);
		} else {

			for (int k = 0; k < n; k++) {
				cashTime[k] = customers[k];					
			}
			
			i = n;
			
			while (i < customers.length) {
				
				System.out.println(Arrays.toString(cashTime) + "1st line");
				
				min = cashTime[0];
				int index = 0;
				
				for (int r = 1; r < n; r++) {
					
					if (min > cashTime[r]) {
						min = cashTime[r];
						index = r;
					}	
					 
					
				}
				System.out.println(min + "min element");				
			
				cashTime[index] = cashTime[index] + customers[i];
				
				i++;
				
				System.out.println(Arrays.toString(cashTime) + "next line");
				
			}

			for (int j = 0; j <= n; j++) {
				if (cashTime[j] > time) {
					time = cashTime[j];
				}
				System.out.println(Arrays.toString(cashTime));
				System.out.println(time);
				return time;

			}
		}

		return time;
	}
}
