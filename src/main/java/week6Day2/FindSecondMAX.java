package week6Day2;

import org.testng.annotations.Test;

public class FindSecondMAX {
/*
 * 
 * 
 * 
 * Input : {1,2,3,4,5}
 * Output: 4
 * 
 * Pseudocode:
 * find the max number and second max number
 */
	@Test
	public static void Test1() {
		int[] inpArray = {1,2,3,4,5};
		System.out.println(findSecondMAx(inpArray));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {1,1,1,1};
		System.out.println(findSecondMAx(inpArray));
	}
	
	public static int findSecondMAx(int[] nums) {
		int maxNum = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		
		for(int i = 0;i<nums.length;i++){
			if(nums[i]>maxNum) {
				secondMax = maxNum;
				maxNum = nums[i];
				
			}
			else if(secondMax>nums[i]&&nums[i]<maxNum) {
				secondMax = nums[i];
			}
		}
						
		return secondMax;
	}
}
