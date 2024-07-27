package org.packaging.interviewquestins1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TopicQuestionR {

	public static void main(String[] args) {

		int arr[] = {1,5,7,9,11};
		
		int number = 16;
		Long[][] dp = new Long[arr.length][number+1];
	    for(Long ref[] : dp ) Arrays.fill(ref, -1);
		
		long requiredCoins = requiredCoins(arr, 0,number,dp);
		
		System.out.println(requiredCoins);
	}

	private static long requiredCoins(int[] arr, int j, int number,	Long[][] dp) {
		
		if(number < 0) return 0;
		if(number == 0)  return 1;
			
		if(dp[j][number] > -1) return dp[j][number];
		
		long total = 0; 
		
		       for(int i = j; i< arr.length; i++) 
		    	   total +=  requiredCoins(arr, j, number-arr[j],dp);
		  return dp[j][number] = total;    
		
	}

}
