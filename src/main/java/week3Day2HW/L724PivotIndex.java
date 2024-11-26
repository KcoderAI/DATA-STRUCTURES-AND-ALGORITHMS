package week3Day2HW;

import java.util.HashMap;

import org.testng.annotations.Test;

public class L724PivotIndex {
	/*
	 * 
	* 1) Did I understand the problem? -> If yes, go to next step !!
	* 
	* What is the input(s) type? input array 
	* What is the expected output? integer (pivotIndex)
	* Do I have constraints to solve the problem? No
	* Do I have all informations to go to next step!! yes
	// * How big is your test data set will be? 
	* 
	* 2) Test data set
	* 
	* Minimum of 3 data set !! 
	* Positive, Edge, Negative
	* 
	* Input: nums = [1,7,3,6,5,6]
	* Output: 3
	* Input: nums = [1,2,3]
	* Output: -1
	* Input: nums = [2,1,-1]
	* Output: 0
	* 
	* Input: nums = [0,1]
	* Output: 1
	* 
	* 
	* Validate with the interviewer if the data set is fine by his/her assumptions
	* 
	* 3) Do I know how to solve it?
	* yes
	* Yes - great, is there an alternate?
	* 
	* 4) Ask for hint (If you do not know how to solve)
	* 
	* 5) Do I know alternate solutions as well? 
	* 
	* BruteForce with nested loops. - That is still fine, proceed to solve by what you know !!
	* 
	* 6) If you know alternate solutions -> find out the O Notations
	* (Performance)
	* Time : O(N)
	* Space: O(N)
	* 
	* Then, explain either both or the best (depends on the time)
	* 
	* Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
	* Approach 2: Write down the options and benefits and code the best
	* 
	* 7) Start always with Psuedo code // Two Pointer
	* 
	* 
	*  
	* 8) Implement them in the code (editor)
	* 
	* 9) Test against the different data set
	* 
	* 10) If it fails, debug them to solve it !!
	* */
	/*PsuedoCode:
	 * Define HAshmap.  iterate through the input array, calculate prefixSum from right and add the PREFIX SUM as key in the map and index as value.
	 * calculate prefix sum from left, if sum matches (compare with index value from end) then return index. else -1 in the end.
	 * return result. 
	 */
	@Test
	public static void Test1() {
		int[] inpArray = {1,7,3,6,5,6};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test2() {
		int[] inpArray = {1,2,3};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test3() {
		int[] inpArray = {2,1,-1};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test4() {
		int[] inpArray = {0,1};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}
	@Test
	public static void Test5() {
		int[] inpArray = {-1,-1,0,0,-1,-1};
		
		int result = findPivotIndex(inpArray);
		System.out.println(result);
	}

	public static int findPivotIndex(int[] nums) {
		
		
		int[] outputArray = new int[nums.length];
		int prefixLeftSum = 0, prefixRightSum = 0;
		
		for(int i = nums.length-1;i>=0;i--) {
				prefixRightSum += nums[i];
				outputArray[i] = prefixRightSum;
		}
		for(int i = 0; i < nums.length; i++) {
			prefixLeftSum += nums[i];
			if(prefixLeftSum == outputArray[i]) {
				return i;
			}
		}
		
		return -1;
	}
}
