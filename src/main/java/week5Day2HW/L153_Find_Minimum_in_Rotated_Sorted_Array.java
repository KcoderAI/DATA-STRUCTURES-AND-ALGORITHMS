package week5Day2HW;

import org.testng.annotations.Test;

public class L153_Find_Minimum_in_Rotated_Sorted_Array {
	
/*
 * 
 * 
 * Input: int array
 * Output: int - minimum element in the array.
 * Test Data:
 * Pseudocode:
 * 
 * if any i+1 index is less than i, then that should be the minimum element. - because array is sorted and rotated at pivot index.
 * search using binary search. constrains to solve in logn complexity.
 * for search, check nums[low] lesser than nums[high] then choose left or right.
 * to return answer, check nums[mid+1]<nums[mid] , if true then return the nums[mid+1].
 * check edge conditions. 
 * last element as result: if num[high]<nums[low]&&num[high]<nums[high-1], return nums[high].
 *  array has only one element. length is 1 return that element. length is 0 , return -5001.
 *  
 * 
 * 
 */
	 
	public static void Test1() {
		int[] inpArray = {3,4,5,1,2};
		System.out.println(findMin(inpArray));
	}
	
	 
	public static void Test2() {
		int[] inpArray = {4,5,6,7,0,1,2};
		System.out.println(findMin(inpArray));
	}
	
	 
	public static void Test3() {
		int[] inpArray = {11,13,15,17};
		System.out.println(findMin(inpArray));
	}
	
	@Test
	public static void Test4() {
		int[] inpArray = {5,1,2,3,4};
		System.out.println(findMin(inpArray));
	}
	
	
	public static int findMin(int[] nums) {
		
		int low = 0, high = nums.length-1, mid = 0;
		
		if(nums.length==1) {
			return nums[0];
		}
		
		if(nums[high]<nums[low]&&nums[high]<nums[high-1]) {
			return nums[high];
		}
		
		if(nums[low]<nums[low+1]&&nums[low]<nums[high]) {
			return nums[low];
		}
		
		while(low<high) {
			
			mid = (low+high)/2;
			
			if(nums[mid+1]<nums[mid]) {
				return nums[mid+1];
			}
			else if(nums[mid]<nums[mid-1]) {
				return nums[mid];
			}
			
			else if(nums[low]<nums[high]) {
				
				if(nums[mid]<nums[high]) {
					
					high = mid-1;
					
				}
				else {
					
				low = mid+1;
				
				}
			}
			else if(nums[high]<nums[low]) {
				
				if(nums[mid]>nums[low]) {
					
				  low = mid+1;
				  
				}
				
				else {
					
					high = mid - 1;
				}
			}
		}
		
		return -5001;
	}
}

/*Alternate solution
 * 
 * int start =0, end = nums.length-1;
        while(start < end){
            int mid = (start+end)/2;
            if(nums[mid] < nums[end]) end = mid;
            else start = mid+1;
        }
        return nums[start];
        
        */
