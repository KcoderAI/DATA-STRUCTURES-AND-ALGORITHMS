package Assessment2;

import org.testng.annotations.Test;

public class Problem2_findTarget {
	  
	/*

	   *Input: int array
	   *Output: int - target index
	   *Test Data:
	   int[] nums={4,5,6,7,0,1,2}
		target=0
		0/P =4
		*Constraints:
		1 <= nums.length <= 5000
		-104 <= nums[i] <= 104
		All values of nums are unique.
		nums is an ascending array that is possibly rotated.
		-104 <= target <= 104

	   *Pseudocode
	   *binary search
	    initialise two pointers low=0, high=nums.length-1.
	    
	    start a while loop until (low<=high)				
	 	find the mid point
	 	if nums[mid] equal to target then return mid
	 	
		check if the left part of the array is sorted
	 	check if the target is lying between the range
		then high=mid-1
			else low=mid+1
			
		check if the right portion is sorted
		check if the target lies between the range
		then low = mid+1
		else high = mid-1

		In the end if target not found then, return -1.
		
		*Time Complexity: O(logN)
		*Space Complexity:O(1)
	     */
	
		//Unit Tests
	   @Test
	    public void testOne() {
	        int[] nums = {4, 5, 6, 7, 0, 1, 2};
	        int target = 0;
	        int i = findtheTargetIndex(nums, target);
	        System.out.println(i);
	    }

	    @Test
	    public void testTwo() {
	        int[] nums = {4, 5, 6, 7, 0, 1, 2};
	        int target = 3;
	        int i = findtheTargetIndex(nums, target);
	        System.out.println(i);
	    }

	    @Test
	    public void testThree() {
	        int[] nums = {1};
	        int target = 0;
	        int i = findtheTargetIndex(nums, target);
	        System.out.println(i);
	    }
	  /*  @Test
	    public static void Test4() {
	    	int[] nums = {1,0,1,1,1}; //nums should be unique
	    	int target = 0;
	        int i = findtheTargetIndex(nums, target);
	        System.out.println(i);
	    }*/

	    //Code
	    
	    public static int findtheTargetIndex(int[] nums, int target) {
	       
	    	
	        int low = 0, high = nums.length - 1, mid = 0;
	        
	        while (low <= high) {
	        	
	            mid = (low + high) / 2;
	            
	            if (nums[mid] == target) {
	            	
	                return mid;
	                
	            } else if (nums[low] <= nums[mid]) {
	            	
	                if (nums[low] <= target && target <= nums[mid]) {
	                	
	                    high = mid - 1;
	                    
	                } else {
	                	
	                    low = mid + 1;
	                    
	                }

	            } else if (nums[high] >= nums[mid]) {
	            	
	                if (nums[high] >= target && target >= nums[mid]) {
	                	
	                    low = mid + 1;
	                    
	                } else {
	                	
	                    high = mid - 1;
	                    
	                }

	            }

	        }
	        
	        return -1;
	    }
	    
}
