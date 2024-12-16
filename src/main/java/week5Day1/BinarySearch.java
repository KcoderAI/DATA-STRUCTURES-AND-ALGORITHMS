package week5Day1;

import org.testng.annotations.Test;

public class BinarySearch {
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
	 * Binary search:
	 *initialise two pointers low=0, high=nums.length-1
	 *while (low<=high)
	 *	- find the mid point
	 *	- if (nums[mid]==target) return mid;
	 *	- if <something> move left
	 *		high=mid-1
	 *	- if <something> move to right
	 *		low=mid+1;
	 * 
	 */
		
		
		
		
		@Test
		public static void Test1() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 200;
			System.out.println(binarySearch(inputArr,k));
		}
		
		@Test
		public static void Test2() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 300;
			System.out.println(binarySearch(inputArr,k));
		}
		
		@Test
		public static void Test3() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 400;
			System.out.println(binarySearch(inputArr,k));
		}
		
		@Test
		public static void Test4() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 500;
			System.out.println(binarySearch(inputArr,k));
		}
		
		public static int binarySearch(int[] nums, int k) {
			
			int low = 0, high = nums.length-1;
			
			while(low<=high) {
				
				int mid = (low+high)/2;
				// int mid = low + (high-low)/2; ( To avoid overflow)
				if(nums[mid] == k) {
					return mid;
				}
				else if(nums[mid] > k) {
					
					high = low - 1;
					
				}
				else {
					low = mid + 1;
				}
			}
			
			return -1;
		}
	
}
