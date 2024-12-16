package week4SlidingWindow;
import org.testng.annotations.Test;


public class PrintsubArrayOfSizeK {

	/*
	 * 
	 * https://www.bing.com/videos/riverview/relatedvideo?&q=youtube+sliding+window+Sandeep+Kumar&&mid=21D05A22FDC40B90C95421D05A22FDC40B90C954&&FORM=VRDGAR
	 * Input : int array, int k.
	 * Output : subArray sum print
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
	 * Problem Statement : Print all  subarrays of window size k .
	 * Psuedo code: 
	 * 
	 * 
	 */
		
		
		
		
		@Test
		public static void Test1() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 2;
		//	System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		
		@Test
		public static void Test2() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 4;
		//	System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		
		@Test
		public static void Test3() {
			int[] inputArr = {100, 200, 300, 400};
			int k = 1;
			//System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		
		@Test
		public static void Test4() {
			int[] inputArr = {1,2,3,4,5};
			int k = 3;
			//System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		@Test
		public static void Test5() {
			int[] inputArr = {9,7,0,1,2,5};
			int k = 2;
			//System.out.println(maxSum(inputArr,k));
			maxSum(inputArr,k);
		}
		
		public static void maxSum(int[] arr, int k) {
			
			int currentSum = 0, start= 0, end =0;
			
			for(end =0;end<arr.length;end++) { //calculate  for 0 to k first in for loop always for sliding window.
				
				currentSum += arr[end];
				
			if(end >= k-1) {
				
				System.out.println(currentSum);
				currentSum -= arr[start];
				start++;
				
			}
			
			
		}
	}
public static void longestSubStringMUnique(int[] arr, int m) {//aabbcc k =1
			
			int currentSum = 0, start= 0, end =0;
			
			for(end =0;end<arr.length;end++) { //calculate  for 0 to k first in for loop always for sliding window.
				
				currentSum += arr[end];
				
			if(end >= m-1) {
				
				System.out.println(currentSum);
				currentSum -= arr[start];
				start++;
				
			}
			
			
		}
	}
}
