package week3Day1;

import org.testng.annotations.Test;

public class TrappingWaterwithPrefixMax {
	@Test
	public static void Test8() {
		int[] inputArray = {0,1,0,2,1,0,1,3,2,1,2,1};
		//int k = 40;
		int maxSum = storeWater(inputArray);
		System.out.println(maxSum);
		
	}//Empty //-1
	
	
	
	public static int storeWater(int[] nums) {
	int ans = 0;
	int[] leftMaxHeights = new int[nums.length];
	int[] rightMaxHeights = new int[nums.length];
	leftMaxHeights[0] = nums[0];
	rightMaxHeights[rightMaxHeights.length-1]= nums[nums.length-1];
	
	//find out left heights
	for(int i =1;i<nums.length;i++) {
		leftMaxHeights[i] = Math.max(leftMaxHeights[i-1],nums[i]);
	}
	for(int i =rightMaxHeights.length-2;i>=0;i--) {
		rightMaxHeights[i] = Math.max(rightMaxHeights[i+1],nums[i]);
	}
	//Compute the ans
	for(int i=0;i<nums.length;i++) {
		
		ans = ans+ Math.max(0,Math.min(leftMaxHeights[i],rightMaxHeights[i])-nums[i]);
		
	}
	return ans;
}
}
