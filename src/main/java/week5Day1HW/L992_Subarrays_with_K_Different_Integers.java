package week5Day1HW;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class L992_Subarrays_with_K_Different_Integers {
/*
 * 
 * Input: int array and int k
 * Output : int count( count of good subarrays)
 * 
 * Have two pointers. one is fast pointer right:
 * another one is slow pointer left.
 * 
 * initialize map and find the size of it. if it exceeds k size, break the loop. dont count
 * if the size is less or equal to k, then increase count.
 * start from left most pointer for second iteration until end of loop.
 * 
 *
 * 
 * 
 * 
 * 
 * 
 */
	 
	public static void Test1() {
		int[] inpArray = {1,2,1,2,3};
		int k = 2;
		System.out.println(findGoodSubArray(inpArray, k));
	}
	
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,1,3,4};
		int k = 3;
		System.out.println(findGoodSubArray(inpArray, k));
	}
	
	
	public static void Test3() {
		int[] inpArray = {2,1,2,1,2};
		int k = 2;
		System.out.println(findGoodSubArray(inpArray, k));
	}
	public static int findGoodSubArray(int[] nums, int k) {
		
		int count = 0, left = 0;
		Map<Integer,Integer> map = new HashMap<>();
		
		
		for(int right = 0;right<nums.length;right++) {
			
			map.put(nums[right], 0);
			if(map.size()==k) {
				count = count + 1;
			}
			else if ((map.size()>k)) {
				map.clear();
				right = left++;
			}
			if(right==nums.length-1 && (left-1)!=right) {
				right = ++left;
			}
		}
		
		
		return count;
	}
}
