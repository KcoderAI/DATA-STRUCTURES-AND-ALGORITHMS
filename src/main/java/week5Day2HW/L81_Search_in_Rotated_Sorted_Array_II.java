package week5Day2HW;

import org.testng.annotations.Test;

public class L81_Search_in_Rotated_Sorted_Array_II {
/*
 * 
 * Input: int array
 * Output: boolean true or false
 * 
 * 
 * 
 */
@Test
public static void Test1() {
	int[] inpArray = {2,5,6,0,0,1,2};
	int target = 0;
	System.out.println(searchll(inpArray, target));
}

@Test
public static void Test2() {
	int[] inpArray = {2,5,6,0,0,1,2};
	int target = 3;
	System.out.println(searchll(inpArray, target));
}

@Test
public static void Test3() {
	int[] inpArray = {1,0,1,1,1};
	int target = 0;
	System.out.println(searchll(inpArray, target));
}

@Test
public static void Test4() {
	int[] inpArray = {1};
	int target = 0;
	System.out.println(searchll(inpArray, target));
}
public static boolean searchll(int[] nums, int target) {
	
	int low = 0, high = nums.length-1, mid = 0;
	
	while(low <= high) {
		
	if(nums[low]!=nums[high]) {
			
		
		mid = (low+high)/2;
		
		if(target==nums[mid]) {
			
			return true;
			
		}
		else if (nums[low]<=nums[mid]) {
		
			if(nums[low] <= target && target <= nums[mid]) {
				
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		else if(nums[high] >= nums[mid]) {
			
			if(nums[mid]<= target && target<= nums[high]) {
				
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
	}
	
	else {
			if(nums[low]==target) {
				
			return true;
		   }
			while((low<=high) && (nums[low]==nums[high])) {
				
				low++;
			}
			
			
		}
	}
	
	return false;
}
}
