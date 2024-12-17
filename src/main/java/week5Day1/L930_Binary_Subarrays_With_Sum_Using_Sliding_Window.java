package week5Day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class L930_Binary_Subarrays_With_Sum_Using_Sliding_Window {
	
	@Test
	public static void Test1() {
		int[] inputArr = {1,0,1,0,1};
		int k = 2;
		System.out.println(numSubarraysWithSum(inputArr,k));
	}
	
	@Test
	public static void Test2() {
		int[] inputArr = {0,0,0,0,0};
		int k = 0;
		System.out.println(numSubarraysWithSum(inputArr,k));
	}
	
	
	public static int numSubarraysWithSum(int[] nums, int goal) {
		
	/*	if(goal==0) {
			return findSubArrayZeroSum(nums,goal);
		}*/
		
			int kSumCount = findSubArraySum(nums,goal);
			int kMinusOneSumC = findSubArraySum(nums,goal-1);
			
			return kSumCount - kMinusOneSumC;
			
		//	return  findSubArraySum(nums,goal) - findSubArraySum(nums,goal-1);

	       
	        }
	
	public static int findSubArraySum(int[] nums, int goal) {

        int count=0,left=0,sum=0;
        if(goal<0) {
        	return 0;
        }
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];

            while(sum>goal)
            {
             sum-=nums[left];
             left++;

            }
            count+=right-left+1;
        }

        return count;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static int findSubArrayZeroSum(int[] nums, int goal) {
		int count = 0; 
		int zeroSegmentLength = 0; 
		for (int num : nums) {
		 if (num == 0) {
			 zeroSegmentLength++; 
		  } 
		 else { 
			 count += zeroSegmentLength * (zeroSegmentLength + 1) / 2;
			 zeroSegmentLength = 0;
		 } 
		} 
			// Account for the last segment if it ends with zeros
		
		if (zeroSegmentLength > 0) {
		 count += zeroSegmentLength * (zeroSegmentLength + 1) / 2; 
		} 
		
		return count;

		
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
