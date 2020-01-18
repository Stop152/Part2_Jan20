package jtm.tasks.fundamentals;

import java.util.Arrays;

public class EvenNumbers {

    //TODO
        /*
            Complete the function which takes two arguments and returns all numbers which
            are divisible by the given divisor.
            First argument is an array of numbers and the second is the divisor.
            Example:
            divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
         */
    public static int[] divisibleBy(int[] numbers, int divider) {
    	
    	System.out.print(Arrays.toString(numbers));
    	System.out.println(divider);
    	
    	int[] massiveFinal = new int[numbers.length];
    	
    	int counter = 0;
    	
    	for (int i=0; i<numbers.length; i++) {
    		if (numbers[i] % divider == 0) {
    			massiveFinal [counter] = numbers[i];
    			counter++;
    		}
    	}
    	
    	int m = counter--;
    	int[] massiveDivider = new int[m];
    	
    	for (int j = 0; j<m; j++) {
    		massiveDivider [j] = massiveFinal [j];
    	}

		System.out.println(Arrays.toString(massiveFinal));
		System.out.println(Arrays.toString(massiveDivider));
		return massiveDivider;
      
    }
}
