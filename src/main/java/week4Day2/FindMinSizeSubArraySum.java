package week4Day2;

import org.testng.annotations.Test;
/*
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 * Input: int array
 * Output: int minLen.
 * Test data: 
 * Pseudocode:
 * create two pointers one as slow pointer(p1) and other as fast pointer(p2).
 * iterate input array until length using fast pointer
 * whenever target sum(sum>=k) is calculated, calculate the min len and remove the leftmost index (using p1 pointer)
 * and increase p1. do this in while until sum is >=k. each time calculating minlen.
 * repeat this until end of input array.
 * In the end, minLen has minimum length of the subarray, which has sum>=k.
 * if minlen is 100001 then set it to -1.(that means no subarray exists with sum>=k),this is the largest value from leetcode. 
 */

public class FindMinSizeSubArraySum {
	
	@Test
	public static void Test1() {
		int[] inputArr = {2,3,1,2,4,3};
		int k = 7;
		System.out.println(minSubArray(inputArr,k));
	}
	@Test
	public static void Test2() {
		int[] inputArr = {2,3,1,2,4,7,3};
		int k = 7;
		System.out.println(minSubArray(inputArr,k));
	}
	@Test
	public static void Test3() {
		int[] inputArr = {2,2,0,0,1,1};
		int k = 7;
		System.out.println(minSubArray(inputArr,k));
	}

	public static int minSubArray(int[] nums, int target) {
		
		int minLen = 10001;
		
		int p1=0,preSum=0;
		
		for(int p2 = 0; p2< nums.length;p2++) {
			
			preSum += nums[p2];
			
			while(preSum >= target) {
				
				minLen = Math.min(minLen, p2-p1+1);
				preSum -= nums[p1];
				p1++;
			}
				
				
			}
			
		
		if(minLen==10001){
			minLen = 0;
		}
		
		return minLen;
	}
}
