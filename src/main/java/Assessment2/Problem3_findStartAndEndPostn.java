package Assessment2;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Problem3_findStartAndEndPostn {
	/*
	 * 
 * Input: int array
 * Output: array of length 2  - indexes of first and last position : default is -1,-1
 * data has duplicate value and negatives.
 * Test Data:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Input: nums = [], target = 0
 * 
 * Pseudocode: Method1
 * 
 * define mid as left and right /2
 * if mid <target
 * move to right that is set low to mid+1
 * if mid> target, 
 * move to left set high to mid-1.
 * if mid==target temp = mid;save the index in temp.
 * first the first occurence using while loop.
 *  while(temp<nums.length;nums[temp]==target)
 *   temp--;
 *   temp+1 is the first position.
 *   
 *   temp = mid;
 *   while(mid<nums.length;nums[mid]==target)
 *   temp++;
 *   temp-1 is the last position.
 * 		return temp+1 and temp-1 in array.
 * 	in the end, if nothing found, then return -1,-1.	
 * 
 * Time Complexity:O(n)
 * 
 * Space complexity: O(1)
 * 
 * Pseudocode: Method2
 * two helper functions. to return first and last position. call helper functions and Initialize output array of size 2 and return output array.
 * funct1: find the firstOccurence: use binary search to find first position of the target
 * functn2: find last occurence: use binary search to find last position of the target
 * findfirst: it finds the first occurrence
 * if mid value is target and its the first occurrence or the prev value is not the target, return mid.
 * else set high = mid-1 to find first occurence.
 * findlast: it finds the last occurrence
 * if mid value is target and its the last occurrence or the next value is not the target, return mid.
 * else set low = mid+1 to find last occurence.
 * * Time Complexity:O(logN) + O(logN) = O(logN)
 * 
 * Space complexity: O(1)
 * 
 * 
 * 
 */
	//Unit Tests
	@Test
	public static void Test1() {
		int[] inpArray = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	@Test
	public static void Test2() {
		int[] inpArray = {5,7,7,8,8,10};
		int target = 6;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	
	@Test
	public static void Test3() {
		int[] inpArray = {};
		int target = 0;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	@Test
	public static void Test4() {
		int[] inpArray = {8,8,8,8};
		int target = 8;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	
	//Code Method 1: TC: O(n) SC:O(1)
	
	/*public static int[] findFirstAndLastPstn(int[] nums, int target) {
		
		int left = 0, right = nums.length-1;
		int[] outputArray = new int[2];
		
		while(left <= right) {
			
			int mid = (left+right)/2;
			
			if(nums[mid] < target) {
				left = mid + 1;
			}
			else if(nums[mid] > target) {
				right = mid-1;
			}
			else {
				int temp = mid;
				while(temp>=0 && nums[temp]==target) {
					  temp--;
					  
				 }
				outputArray[0] = temp+1; 
				temp = mid;
				while(temp<nums.length && nums[temp]==target) {
					  temp++;
					  
				 }
				outputArray[1] = temp-1; 
				return outputArray;
				
			}
		}
		
		return new int[] {-1,-1};
	}
}*/
	
//Code : Method 2: TC: O(logN) SC:O(1)

public static int[] findFirstAndLastPstn(int[] nums, int target) {
	
		int[] outputArray = new int[2];
		
		outputArray[0] = findFirst(nums, target); 
		
		outputArray[1] = findLast(nums, target); 
		
		return outputArray;
	}
		

public static int findFirst(int[] nums, int target) {
	
	int low = 0, high = nums.length - 1;
	
	while (low <= high) { 
		
		int mid = low + (high - low) / 2;
		
		if (nums[mid] < target) { 
			
			low = mid + 1; 
			
			} 
		else if(nums[mid] > target) { 
				
				high = mid - 1; 
				
				} 
		else {
					
			if (mid == 0 || nums[mid - 1] != target) {
						
			return mid; 
			} 
			
			high = mid - 1;
						
						}
		} 
	return -1;
}

public static int findLast(int[] nums, int target) { 
	
	int low = 0, high = nums.length - 1; 
	
	while (low <= high) { 
		
		int mid = low + (high - low) / 2; 
		
		if (nums[mid] < target) { 
			
			low = mid + 1; 
			
			} 
		
		else if (nums[mid] > target) { 
			
			high = mid - 1; 
			
			}
		
		else {
			
			if (mid == nums.length - 1 || nums[mid + 1] != target) { 
				
				return mid; 
				
				} 
			low = mid + 1; 
			} 
		} 
	
	return -1; 
	
		}

	}

