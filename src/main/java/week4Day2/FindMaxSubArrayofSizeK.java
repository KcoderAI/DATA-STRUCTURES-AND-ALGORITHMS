package week4Day2;

import org.testng.annotations.Test;

public class FindMaxSubArrayofSizeK {
/*
 * 
 * https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1 
 * Input : int array, int k.
 * Output : int maxSum
 * Algo : Sliding window
 * Test Data :
 * Input: arr[] = [100, 200, 300, 400] , k = 2
 * Output: 700
 * Input: arr[] = [100, 200, 300, 400] , k = 4
 * Output: 1000
 * Input: arr[] = [100, 200, 300, 400] , k = 1
 * Output: 400
 * 
 * Big O Notations:
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * 
 * Psuedo code:
 * initialize maxsum and currensum to 0.
 * Starting from 0 index until k length, 
 * calculate the k sum values.
 * 
 */
	
	
	
	
	@Test
	public static void Test1() {
		int[] inputArr = {100, 200, 300, 400};
		int k = 2;
		System.out.println(maxSum(inputArr,k));
	}
	
	@Test
	public static void Test2() {
		int[] inputArr = {100, 200, 300, 400};
		int k = 4;
		System.out.println(maxSum(inputArr,k));
	}
	
	@Test
	public static void Test3() {
		int[] inputArr = {100, 200, 300, 400};
		int k = 1;
		System.out.println(maxSum(inputArr,k));
	}
	
	public static int maxSum(int[] arr, int k) {
		
		int maxSum = 0, currentSum = 0;
		
		for(int i =0;i<k;i++) { //calculate  for 0 to k first in for loop always for sliding window.
			
			currentSum += arr[i];
			
		}
		
	//	maxSum = Math.max(maxSum, currentSum); 
		
		maxSum = currentSum;
		
	/*	for(int i = 1;i<arr.length-k+1;i++) { //for(int i = 1;i<=arr.length-k;i++)
			currentSum -= arr[i-1];
			currentSum += arr[i+k-1];
			maxSum = Math.max(maxSum, currentSum);
		}*/
		
		for(int i = k; i < arr.length; i++) {
			
			currentSum -= arr[i-k];
			currentSum += arr[i];
			maxSum = Math.max(maxSum, currentSum);
		}
		
		return maxSum;
	}
}
