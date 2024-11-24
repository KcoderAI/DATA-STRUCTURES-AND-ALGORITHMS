package week3Day1;

import org.testng.annotations.Test;

public class TrappingWaterwithTwoPointers {
	
	@Test
	public static void Test8() {
		
	
		int[] inputArray = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int maxSum = storeWater(inputArray);
		System.out.println(maxSum);
		
	}//Empty //-1
	
	
	
	public static int storeWater(int[] nums) {
	
		int left = 0, right = nums.length-1, ans = 0;
		int leftMax = Integer.MIN_VALUE; 
		int rightMax = Integer.MIN_VALUE;
		
		while(left<=right) {
			if(nums[left]<=nums[right]) {
				if(nums[left]>=leftMax) {
					leftMax = nums[left];
				}
					else {
						ans += leftMax - nums[left];
						
				}
				left++;
			}
			else {
				if(nums[right]>=rightMax) {
					rightMax = nums[right];
				 }
				else {
					ans += rightMax - nums[right]; 
				}
				 right--;
				}
			
			}
		
	return ans;
}
}
