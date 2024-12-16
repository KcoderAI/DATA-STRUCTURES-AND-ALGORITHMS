package week5Day1;

import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class L33_Search_in_Rotated_Sorted_Array {


    /*

   i/p
int[] nums={4,5,6,7,0,1,2}
target=0
0/P =4
    initialise two pointers low=0, high=nums.length-1, ans-1
- while (low<=high):
- find the mid point
- if (nums[mid]==target) return mid;
- check if the left part of the array (l-m) is sorted
- check if the target is lying between the range
- high=mid-1
- else low=mid+1
- check if the right portion is sorted
- check if the target lies between the range
- low= mid+1
- else high=mid-1

return -1
     */

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
    	int[] nums = {1,0,1,1,1};
    	int target = 0;
        int i = findtheTargetIndex(nums, target);
        System.out.println(i);
    }*/


    public static int findtheTargetIndex(int[] nums, int target) {
        //4, 5, 6, 7, 0, 1, 2
       // int result = -1;
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
        