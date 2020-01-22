package jtm.tasks.fundamentals;

import java.util.Arrays;

public class PhoneNumber {

	/*
	 * TODO
	 * 
	 * Write a function that accepts an array of 10 integers (between 0 and 9), that
	 * returns a string of those numbers in the form of a phone number.
	 * 
	 * Example: createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // =>
	 * returns "(123) 456-7890"
	 * 
	 * The returned format must be correct in order to complete this challenge.
	 * Don't forget the space after the closing parentheses!
	 */

	public static String createPhoneNumber(int[] numbers) {

		StringBuilder str = new StringBuilder("(");
		for (int i = 0; i < numbers.length; i++) {
			if (i == 3) {
				str.append(") ");
			} else if (i == 6) {
				str.append("-");
			}

			str.append(numbers[i]);
		}

//    	String str = "(" + numbers[0]+numbers[1]+numbers[2]+") " + numbers[3] + numbers[4]+ numbers[5]
//    	 + "-" + numbers[6]+ numbers[7]+ numbers[8]+ numbers[9];
//    	
		System.out.println(str);

		return str.toString();
	}
}
