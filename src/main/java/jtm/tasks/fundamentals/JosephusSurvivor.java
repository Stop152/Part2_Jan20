package jtm.tasks.fundamentals;

import java.util.Arrays;

public class JosephusSurvivor {

    /*
    TODO

    You have to correctly return who is the "survivor", ie: the last element of a Josephus permutation.

    Basically you have to assume that n people are put into a circle and that they are eliminated in steps of
    k elements, like this:

    josephus_survivor(7,3) => means 7 people in a circle; one every 3 is eliminated until one remains
    [1,2,3,4,5,6,7] - initial sequence
    [1,2,4,5,6,7] => 3 is counted out
    [1,2,4,5,7] => 6 is counted out
    [1,4,5,7] => 2 is counted out
    [1,4,5] => 7 is counted out
    [1,4] => 5 is counted out
    [4] => 1 counted out, 4 is the last element - the survivor!
    The above link about the "base" kata description will give you a more thorough insight about the origin of this
    kind of permutation, but basically that's all that there is to know to solve this.

    You may assume that both n and k will always be >=1.
     */

    public static int josephusSurvivor(final int n, final int k) {
    	
    	int[] list = new int[n];
    	int g =n;
    	   	
    	System.out.println(Arrays.toString(list));    		
    	
    	for (int l=0; l<g; l++) {
    		list[l]=1;
    	
    	for (int p=1; p<g; p++) {
    		list [p] = p++;
    		p=p--;
    	}
    	g=g--;
    	}
    	 
    	int i = 0;
    	int u = n;
    	while (i<n) {
    		i=i+k-1;
    		list[i] = 0;    		
    	}  	  
    		
    	
    	int result =0;  
    	
    	for(int r=0; r<n; r++) {
    		result = result + list[i];
    	}
        return result;
    }

    public static void main(String args[]) {
        josephusSurvivor(7, 3);
    }
}
