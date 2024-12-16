package week4Day2HW;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class L930Binary_Subarrays_With_Sum {
	
	@Test
	public static void Test1() {
		int[] inputArr = {1,0,1,0,1};
		int k = 2;
		System.out.println(maxSum(inputArr,k));
	}
	
	@Test
	public static void Test2() {
		int[] inputArr = {0,0,0,0,0};
		int k = 0;
		System.out.println(maxSum(inputArr,k));
	}
	
	@Test
	public static void Test3() {
		int[] inputArr = {100, 200, 300, 400};
		int k = 1;
		System.out.println(maxSum(inputArr,k));
	}
	
	public static int maxSum(int[] nums, int goal) {
		
		Map<Integer, Integer> prefixSumCount = new HashMap<>(); 
		
		prefixSumCount.put(0, 1); // To handle cases where the subarray starts from index 0 
		
		int currentSum = 0;
		int result = 0; 
		
		for (int num : nums) { 
			
			currentSum += num; 
			if (prefixSumCount.containsKey(currentSum - goal)) { 
				
				result += prefixSumCount.get(currentSum - goal);
				
				} 
			
			prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1); 
			
		   } 
		
		return result;
	}
}
















	//	int maxSum = 0, currentSum = 0, count = 0, p1 = 0, sum = 0;
		
		/*for(int i =0;i<goal;i++) { //calculate  for 0 to k first in for loop always for sliding window.
			
			currentSum += nums[i];
			
		}
		
	//	maxSum = Math.max(maxSum, currentSum); 
		
		maxSum = currentSum;*/
		
	/*	for(int i = 1;i<arr.length-k+1;i++) { //for(int i = 1;i<=arr.length-k;i++)
			currentSum -= arr[i-1];
			currentSum += arr[i+k-1];
			maxSum = Math.max(maxSum, currentSum);
		}*/
		
	/*	sum = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
			if(sum == goal) {
				count++;
			}
			else if(nums[i] > goal){
				sum -= nums[p1];
				p1++;
				while(i < nums.length-1 && sum == goal) {
					i++;
					count++;
					 sum += nums[i];
									
					}
			}
			else {
				sum += nums[p1];
				
				
			}
			
			
			if(sum == goal) {
				
				while(i < nums.length-1 && sum == goal) {
				i++;
				count++;
				 sum += nums[i];
								
				}
				
			}		
			if(sum > goal) {
				sum -= nums[p1];
				p1++;
				while(i < nums.length-1 && sum == goal) {
					i++;
					count++;
					 sum += nums[i];
									
					}
			}
				
		}
		
		return count;
	}
}*/
