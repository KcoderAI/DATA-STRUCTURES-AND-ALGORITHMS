package week5Day2HW;

import java.util.Arrays;

import org.testng.annotations.Test;

public class L977_Squaresof_a_SortedArray {

	//https://leetcode.com/problems/squares-of-a-sorted-array/description/
	/*
	 * Input: int array ( negative and positive numbers with duplicates)
	 * Output: int array 
	 * Test Data:
	 * Pseudocode:
	 * 
	 * use two pointers
	 * one left to 0 index and another right to nums.length-1 index
	 * square it and compare both, if left is bigger write into an o/p array. if right is bigger write it to an output array. increment the pointer.
	 * 
	 * 
	 * 
	 */
	@Test
	public static void Test1() {
		int[] inpArray = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(findSquaresofnums(inpArray)));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {-7,-3,2,3,11};
		System.out.println(Arrays.toString(findSquaresofnums(inpArray)));
	}
	
	public static int[] findSquaresofnums(int[] nums) {
		
		int left = 0, right = nums.length-1;
		int index = nums.length-1;
		int[] output = new int[nums.length];
		
		while(left<=right) {
			if(nums[left]*nums[left]>=nums[right]*nums[right]) {
				output[index] = nums[left]*nums[left];
				left++;
				index--;
			}
			else {
				output[index] = nums[right]*nums[right];
				right--;
				index--;
				
			}
		}
		
		
		
		return output;
	}
}
