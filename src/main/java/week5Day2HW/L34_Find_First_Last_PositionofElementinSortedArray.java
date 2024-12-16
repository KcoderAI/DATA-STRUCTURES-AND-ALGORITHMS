package week5Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L34_Find_First_Last_PositionofElementinSortedArray {
/*
 * Input: int array
 * Output: array of length 2  - indexes of first and last position : default is -1,-1
 * data has duplicate value and negatives.
 * Test Data:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Input: nums = [], target = 0
 * 
 * Pseudocode:
 * 
 * define mid as left and right /2
 * if mid <target
 * move to right that is set low to mid+1
 * if mid> target, 
 * move to left set high to mid-1.
 * if mid==target temp = mid;
 *  while(mid<nums.length;nums[mid]==target)
 *   mid--;
 *   nums[temp+1] is the first position.
 *   
 *   temp = mid;
 *   while(mid<nums.length;nums[mid]==target)
 *   mid++;
 *   nums[temp-1] is the last position.
 * 
 */
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
		int[] inpArray = {8,8,8,8};
		int target = 8;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	@Test
	public static void Test4() {
		int[] inpArray = {};
		int target = 0;
		System.out.println(Arrays.toString(findFirstAndLastPstn(inpArray,target)));
	}
	
	public static int[] findFirstAndLastPstn(int[] nums, int target) {
		
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
	
}
